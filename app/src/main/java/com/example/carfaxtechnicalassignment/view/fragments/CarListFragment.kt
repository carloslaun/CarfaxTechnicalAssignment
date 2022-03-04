package com.example.carfaxtechnicalassignment.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carfaxtechnicalassignment.R
import com.example.carfaxtechnicalassignment.databinding.FragmentCarListBinding
import com.example.carfaxtechnicalassignment.model.ListingsItem
import com.example.carfaxtechnicalassignment.view.adapter.ItemsAdapter
import com.example.carfaxtechnicalassignment.viewmodels.RecyclerCarViewModel


class CarListFragment : Fragment(), ClickListener {
    lateinit var viewModel: RecyclerCarViewModel
    lateinit var binding: FragmentCarListBinding
    private var mAdapter: ItemsAdapter?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = activity?.let {
            ViewModelProvider(it).get(RecyclerCarViewModel::class.java)
        }!!

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_car_list, container, false)
        binding.viewModel = viewModel
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_pokemon_list, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // inicializa recyclerview
        mAdapter = ItemsAdapter(this)
        binding.recyclerview.layoutManager = LinearLayoutManager(context)
        binding.recyclerview.adapter = mAdapter

        //observador de la lista
        viewModel.listState.observe(viewLifecycleOwner) {
            mAdapter?.setItems(list = it)
            binding.progress.isInvisible = true
        }

        viewModel.progressState.observe(viewLifecycleOwner) { show ->
            binding.progress.isVisible = show
        }

        //mAdapter?.setItems(list)
        viewModel.fetchCarData()

    }

    override fun itemSelect(data: ListingsItem) {
        viewModel.setItemSelection(data)

        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(android.R.id.content, CarDetailFragment.newInstance())
            ?.addToBackStack(null)
            ?.commit()
    }


}
interface ClickListener {
    fun itemSelect(data: ListingsItem)
}
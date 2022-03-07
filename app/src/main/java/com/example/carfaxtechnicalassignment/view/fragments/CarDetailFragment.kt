package com.example.carfaxtechnicalassignment.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.carfaxtechnicalassignment.R
import com.example.carfaxtechnicalassignment.databinding.FragmentCarDetailBinding
import com.example.carfaxtechnicalassignment.viewmodels.RecyclerCarViewModel


class CarDetailFragment : Fragment() {

    private var _binding: FragmentCarDetailBinding? = null
    private val binding get() = _binding

    lateinit var viewModel: RecyclerCarViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel =
            activity?.let {
                ViewModelProvider(it).get(RecyclerCarViewModel::class.java)
            }!!

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentCarDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.itemDataSelected?.let { data ->
            Glide.with(requireContext()).load(data.images?.firstPhoto?.large).into(binding!!.img)
            binding!!.tvYear.text = data.year.toString() + " " + data.make + " " + data.model + " " + data.trim
            binding!!.tvPrice.text = "$ " + data.currentPrice.toString() + "  | " + data.mileage.toString() + "k mi"
            binding!!.tvCity.text = "Location: " + data.dealer?.city + ", " + data.dealer?.state
            binding!!.tvExteriorColor.text = "Exterior Color: " + data.exteriorColor
            binding!!.tvInteriorColor.text = "Interior Color: " + data.interiorColor
            binding!!.tvDriveType.text = "Drive Type: " + data.drivetype
            binding!!.tvTransmission.text = "Transmission: " + data.transmission
            binding!!.tvEngine.text = "Engine: " + data.engine
            binding!!.tvBodyType.text = "Body Style: " + data.bodytype
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(

        ) = CarDetailFragment()
    }

}
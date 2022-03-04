package com.example.carfaxtechnicalassignment.model

import com.google.gson.annotations.SerializedName

data class CarResponse(

	@field:SerializedName("totalListingCount")
	val totalListingCount: Int? = null,

	@field:SerializedName("dealerNewCount")
	val dealerNewCount: Int? = null,

	@field:SerializedName("listings")
	val listings: MutableList<ListingsItem> = mutableListOf(),

	@field:SerializedName("dealerUsedCount")
	val dealerUsedCount: Int? = null,

	@field:SerializedName("enhancedCount")
	val enhancedCount: Int? = null,

	@field:SerializedName("pageSize")
	val pageSize: Int? = null,

	@field:SerializedName("totalPageCount")
	val totalPageCount: Int? = null,

	@field:SerializedName("searchArea")
	val searchArea: SearchArea? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("backfillCount")
	val backfillCount: Int? = null
)

data class MonthlyPaymentEstimate(

	@field:SerializedName("interestRate")
	val interestRate: Int? = null,

	@field:SerializedName("monthlyPayment")
	val monthlyPayment: Double? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("downPaymentAmount")
	val downPaymentAmount: Double? = null,

	@field:SerializedName("termInMonths")
	val termInMonths: Int? = null,

	@field:SerializedName("downPaymentPercent")
	val downPaymentPercent: Int? = null,

	@field:SerializedName("loanAmount")
	val loanAmount: Double? = null
)

data class ListingsItem(

	@field:SerializedName("imageCount")
	val imageCount: Int? = null,

	@field:SerializedName("cabType")
	val cabType: String? = null,

	@field:SerializedName("year")
	val year: Int? = null,

	@field:SerializedName("onePrice")
	val onePrice: Int? = null,

	@field:SerializedName("fuel")
	val fuel: String? = null,

	@field:SerializedName("onlineOnly")
	val onlineOnly: Boolean? = null,

	@field:SerializedName("sortScore")
	val sortScore: Double? = null,

	@field:SerializedName("transmission")
	val transmission: String? = null,

	@field:SerializedName("trim")
	val trim: String? = null,

	@field:SerializedName("oneOwner")
	val oneOwner: Boolean? = null,

	@field:SerializedName("sentLeadAt")
	val sentLeadAt: Any? = null,

	@field:SerializedName("dealerType")
	val dealerType: String? = null,

	@field:SerializedName("backfill")
	val backfill: Boolean? = null,

	@field:SerializedName("vin")
	val vin: String? = null,

	@field:SerializedName("model")
	val model: String? = null,

	@field:SerializedName("displacement")
	val displacement: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("vdpUrl")
	val vdpUrl: String? = null,

	@field:SerializedName("personalUse")
	val personalUse: Boolean? = null,

	@field:SerializedName("mileage")
	val mileage: Int? = null,

	@field:SerializedName("subTrim")
	val subTrim: String? = null,

	@field:SerializedName("images")
	val images: Images? = null,

	@field:SerializedName("firstSeen")
	val firstSeen: String? = null,

	@field:SerializedName("vehicleCondition")
	val vehicleCondition: String? = null,

	@field:SerializedName("bedLength")
	val bedLength: String? = null,

	@field:SerializedName("sentLead")
	val sentLead: Boolean? = null,

	@field:SerializedName("badge")
	val badge: String? = null,

	@field:SerializedName("following")
	val following: Boolean? = null,

	@field:SerializedName("topOptions")
	val topOptions: List<String?>? = null,

	@field:SerializedName("followCount")
	val followCount: Int? = null,

	@field:SerializedName("stockNumber")
	val stockNumber: String? = null,

	@field:SerializedName("serviceRecords")
	val serviceRecords: Boolean? = null,

	@field:SerializedName("interiorColor")
	val interiorColor: String? = null,

	@field:SerializedName("mpgHighway")
	val mpgHighway: Int? = null,

	@field:SerializedName("isEnriched")
	val isEnriched: Boolean? = null,

	@field:SerializedName("engine")
	val engine: String? = null,

	@field:SerializedName("drivetype")
	val drivetype: String? = null,

	@field:SerializedName("bodytype")
	val bodytype: String? = null,

	@field:SerializedName("certified")
	val certified: Boolean? = null,

	@field:SerializedName("make")
	val make: String? = null,

	@field:SerializedName("mpgCity")
	val mpgCity: Int? = null,

	@field:SerializedName("monthlyPaymentEstimate")
	val monthlyPaymentEstimate: MonthlyPaymentEstimate? = null,

	@field:SerializedName("exteriorColor")
	val exteriorColor: String? = null,

	@field:SerializedName("recordType")
	val recordType: String? = null,

	@field:SerializedName("advantage")
	val advantage: Boolean? = null,

	@field:SerializedName("currentPrice")
	val currentPrice: Int? = null,

	@field:SerializedName("noAccidents")
	val noAccidents: Boolean? = null,

	@field:SerializedName("dealer")
	val dealer: Dealer? = null,

	@field:SerializedName("distanceToDealer")
	val distanceToDealer: Double? = null,

	@field:SerializedName("hasViewed")
	val hasViewed: Boolean? = null,

	@field:SerializedName("listPrice")
	val listPrice: Int? = null
)

data class SearchArea(

	@field:SerializedName("zip")
	val zip: String? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("latitude")
	val latitude: Double? = null,

	@field:SerializedName("dynamicRadius")
	val dynamicRadius: Boolean? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("radius")
	val radius: Int? = null,

	@field:SerializedName("longitude")
	val longitude: Double? = null,

	@field:SerializedName("dynamicRadii")
	val dynamicRadii: List<Int?>? = null
)

data class FirstPhoto(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null
)

data class Images(

	@field:SerializedName("small")
	val small: List<String?>? = null,

	@field:SerializedName("baseUrl")
	val baseUrl: String? = null,

	@field:SerializedName("firstPhoto")
	val firstPhoto: FirstPhoto? = null,

	@field:SerializedName("large")
	val large: List<String?>? = null,

	@field:SerializedName("medium")
	val medium: List<String?>? = null
)

data class Dealer(

	@field:SerializedName("carfaxId")
	val carfaxId: String? = null,

	@field:SerializedName("zip")
	val zip: String? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("dealerAverageRating")
	val dealerAverageRating: Double? = null,

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("onlineOnly")
	val onlineOnly: Boolean? = null,

	@field:SerializedName("dealerReviewCount")
	val dealerReviewCount: Int? = null,

	@field:SerializedName("dealerReviewDate")
	val dealerReviewDate: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("dealerReviewReviewer")
	val dealerReviewReviewer: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("dealerReviewRating")
	val dealerReviewRating: Int? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("dealerInventoryUrl")
	val dealerInventoryUrl: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)

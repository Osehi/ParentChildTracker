package com.polish.parentchildtracker.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.polish.parentchildtracker.R
import com.polish.parentchildtracker.adapter.OnBoardingViewPagerAdapter
import com.polish.parentchildtracker.databinding.FragmentOnBoardingBinding
import com.polish.parentchildtracker.view.onboarding.OnBoardingScreenOneFragment
import com.polish.parentchildtracker.view.onboarding.OnBoardingScreenTwoFragment


/**
 * A simple [Fragment] subclass.
 * 
 */
class OnBoardingFragment : Fragment() {

    /**
     * binding reference object
     */
    private var _binding:FragmentOnBoardingBinding? = null
    private val binding:FragmentOnBoardingBinding
    get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOnBoardingBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set view pagerAdapter
        val fragmentList:ArrayList<Fragment> = arrayListOf(OnBoardingScreenOneFragment(), OnBoardingScreenTwoFragment())

        // connect the fragment list to the view pager
        val adapter = requireActivity().supportFragmentManager?.let {
            OnBoardingViewPagerAdapter(
                fragmentList,
                it,
                lifecycle
            )
        }
        binding.onBoardingFragmentVp.adapter = adapter

        // set indicator to the tab layout
        TabLayoutMediator(
            binding.onBoardingFragmentTl,
            binding.onBoardingFragmentVp
        ){tab, position ->}.attach()

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}
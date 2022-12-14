package sheridancollege.prog39402.gursikh991571169

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import sheridancollege.prog39402.gursikh991571169.databinding.FragmentTitleBinding

class TitleFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       val binding: FragmentTitleBinding = DataBindingUtil.inflate(
           inflater, R.layout.fragment_title, container, false)

        (activity as AppCompatActivity).supportActionBar?.title = "Home Page"

        return binding.root
    }
}
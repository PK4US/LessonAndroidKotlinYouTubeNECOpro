package com.pk4us.tablayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import com.pk4us.tablayout.R
import com.pk4us.tablayout.databinding.MainFragmentBinding
import com.pk4us.tablayout.models.MainViewModel
import com.pk4us.tablayout.models.PlantModel


class MainFragment : Fragment() {
    lateinit var binding: MainFragmentBinding
    private val model: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = MainFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            model.plant.value = PlantModel(
                R.drawable.romashka,
                "Рома́шка (лат. Matricária) — род многолетних цветковых растений семейства Астровые, или Сложноцветные (Asteraceae), объединяет около двадцати видов[4] невысоких пахучих трав[5], цветущих с первого года жизни. Наиболее известный вид — Ромашка аптечная (Matricaria chamomilla, syn. Matricaria recutita), это растение широко используется в лечебных и косметических целях.",
                "Часто ромашкой (с ботанической точки зрения ошибочно) называют виды растений других родов семейства Астровые, таких как Астра, Гербера, Дороникум, Нивяник, Остеоспермум, Пиретрум, Пупавка, Трёхрёберник, Хризантема, для соцветий-корзинок которых характерны краевые язычковые цветки с белыми или другой окраски лепестками и более тёмная центральная часть соцветия."
            )
            (activity as AppCompatActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.holder, ContentFragment.newInstance()).commit()
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
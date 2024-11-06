package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmations1, R.drawable.dragonite),
            Affirmation(R.string.affirmations2, R.drawable.ash__torterra),
            Affirmation(R.string.affirmations3, R.drawable.zeraora),
            Affirmation(R.string.affirmations4, R.drawable.greninja),
            Affirmation(R.string.affirmations5, R.drawable.scizor),
            Affirmation(R.string.affirmations6, R.drawable.mew),
            Affirmation(R.string.affirmations7, R.drawable.espeon),
            Affirmation(R.string.affirmations8, R.drawable.decidueye),
            Affirmation(R.string.affirmations9, R.drawable.mawile),
            Affirmation(R.string.affirmations10, R.drawable.mismagius),
        )
    }

}
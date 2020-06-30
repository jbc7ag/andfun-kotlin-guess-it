package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScoreUpdate : Int) : ViewModel() {

    private val _finalScore = MutableLiveData<Int>()
    val finalScore : LiveData<Int>
        get() = _finalScore

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain : LiveData<Boolean>
        get() = _eventPlayAgain


    init{
        Log.i("ScoreViewModel", "ScoreView Model created!!")

        _finalScore.value = finalScoreUpdate
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }

    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}

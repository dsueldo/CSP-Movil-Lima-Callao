package com.remotecsolutionsperu.cspmovillimacallao.data.repositories

import androidx.compose.ui.text.input.TextFieldValue
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.ValidationService

class PasswordValidationService : ValidationService {
    private var errorMessage: String = ""

    override fun validate(input: TextFieldValue): Boolean {
        return when {
            input.text.isEmpty() -> {
                errorMessage = "Ingrese la contraseña"
                false
            }
            else -> true
        }
    }

    override fun getErrorMessage(): String {
        return errorMessage
    }
}
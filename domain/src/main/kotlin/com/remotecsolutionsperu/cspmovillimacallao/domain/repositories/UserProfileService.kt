package com.remotecsolutionsperu.cspmovillimacallao.domain.repositories

import com.remotecsolutionsperu.cspmovillimacallao.domain.entities.user.ProfileUiState

interface UserProfileService {
    suspend fun getProfile(): ProfileUiState
    suspend fun saveProfile(profile: ProfileUiState)
}
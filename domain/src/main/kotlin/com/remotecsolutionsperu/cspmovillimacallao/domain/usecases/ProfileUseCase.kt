package com.remotecsolutionsperu.cspmovillimacallao.domain.usecases

import com.remotecsolutionsperu.cspmovillimacallao.domain.entities.user.ProfileUiState
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.UserProfileService
import javax.inject.Inject

class ProfileUseCase @Inject constructor(
    private val userProfileService: UserProfileService
) {
    suspend fun getProfileData(): ProfileUiState {
        return userProfileService.getProfile()
    }

    suspend fun saveProfileData(profile: ProfileUiState) {
        return userProfileService.saveProfile(profile)
    }
}
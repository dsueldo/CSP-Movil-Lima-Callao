package com.remotecsolutionsperu.cspmovillimacallao.domain.repositories

import com.remotecsolutionsperu.cspmovillimacallao.domain.entities.benefits.Benefits

interface BenefitsRepository {
    suspend fun getAllBenefits(): List<Benefits>
    suspend fun getBenefitsDetail(benefitsId: String): Benefits
}
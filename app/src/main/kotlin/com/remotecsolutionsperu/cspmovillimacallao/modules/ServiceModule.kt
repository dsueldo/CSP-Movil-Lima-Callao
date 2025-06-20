package com.remotecsolutionsperu.cspmovillimacallao.modules

import com.remotecsolutionsperu.cspmovillimacallao.data.repositories.AccountServiceImpl
import com.remotecsolutionsperu.cspmovillimacallao.data.repositories.BenefitsRepositoryImpl
import com.remotecsolutionsperu.cspmovillimacallao.data.repositories.NewsRepositoryImpl
import com.remotecsolutionsperu.cspmovillimacallao.data.repositories.UserProfileServiceImpl
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.AuthRepository
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.BenefitsRepository
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.NewsRepository
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.UserProfileService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {

    @Binds
    abstract fun provideAuthService(authServiceImpl: AccountServiceImpl): AuthRepository

    @Binds
    abstract fun bindNewsRepository(newsRepositoryImpl: NewsRepositoryImpl): NewsRepository

    @Binds
    abstract fun bindBenefitsRepository(benefitsRepositoryImpl: BenefitsRepositoryImpl): BenefitsRepository

    @Binds
    abstract fun provideUserProvideService(userProfileServiceImpl: UserProfileServiceImpl): UserProfileService
}
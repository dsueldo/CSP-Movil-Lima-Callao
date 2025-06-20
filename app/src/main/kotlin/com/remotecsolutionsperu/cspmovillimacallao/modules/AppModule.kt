package com.remotecsolutionsperu.cspmovillimacallao.modules

import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.BenefitsRepository
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.NewsRepository
import com.remotecsolutionsperu.cspmovillimacallao.domain.repositories.UserProfileService
import com.remotecsolutionsperu.cspmovillimacallao.domain.usecases.ProfileUseCase
import com.remotecsolutionsperu.cspmovillimacallao.presentation.viewmodels.benefits.BenefitsListViewModel
import com.remotecsolutionsperu.cspmovillimacallao.presentation.viewmodels.benefits.detail.BenefitsDetailViewModel
import com.remotecsolutionsperu.cspmovillimacallao.presentation.viewmodels.editprofile.EditProfileViewModel
import com.remotecsolutionsperu.cspmovillimacallao.presentation.viewmodels.factories.BenefitsListViewModelFactory
import com.remotecsolutionsperu.cspmovillimacallao.presentation.viewmodels.factories.NewsListViewModelFactory
import com.remotecsolutionsperu.cspmovillimacallao.presentation.viewmodels.news.NewsListViewModel
import com.remotecsolutionsperu.cspmovillimacallao.presentation.viewmodels.news.detail.NewsDetailViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideProfileUseCase(repository: UserProfileService): ProfileUseCase = ProfileUseCase(repository)

    @Provides
    fun provideEditProfileViewModel(profileUseCase: ProfileUseCase,): EditProfileViewModel = EditProfileViewModel(profileUseCase)

    @Provides
    fun provideNewsListViewModel(repository: NewsRepository): NewsListViewModel = NewsListViewModel(repository)

    @Provides
    fun provideNewsDetailViewModel(repository: NewsRepository): NewsDetailViewModel = NewsDetailViewModel(repository)

    @Provides
    fun provideNewsListViewModelFactory(repository: NewsRepository): NewsListViewModelFactory = NewsListViewModelFactory(repository)

    @Provides
    fun provideBenefitsListViewModel(repository: BenefitsRepository): BenefitsListViewModel = BenefitsListViewModel(repository)

    @Provides
    fun provideBenefitsDetailViewModel(repository: BenefitsRepository): BenefitsDetailViewModel = BenefitsDetailViewModel(repository)

    @Provides
    fun provideBenefitsListViewModelFactory(repository: BenefitsRepository): BenefitsListViewModelFactory = BenefitsListViewModelFactory(repository)
}
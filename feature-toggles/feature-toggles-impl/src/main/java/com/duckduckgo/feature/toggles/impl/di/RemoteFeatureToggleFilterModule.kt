/*
 * Copyright (c) 2022 DuckDuckGo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duckduckgo.feature.toggles.impl.di

import com.duckduckgo.di.scopes.AppScope
import com.duckduckgo.feature.toggles.impl.remote.filters.MinimumAppVersionFilter
import com.duckduckgo.feature.toggles.impl.remote.filters.RemoteFeatureToggleFilter
import com.squareup.anvil.annotations.ContributesTo
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
@ContributesTo(AppScope::class)
interface RemoteFeatureToggleFilterModule {
    @Binds
    @IntoMap
    @StringKey(MinimumAppVersionFilter.KEY)
    fun getMinimumAppVersionFilter(impl: MinimumAppVersionFilter): RemoteFeatureToggleFilter
}

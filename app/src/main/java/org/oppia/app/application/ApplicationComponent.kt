package org.oppia.app.application

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import org.oppia.app.activity.ActivityComponent
import org.oppia.data.backends.gae.NetworkModule
import org.oppia.domain.classify.InteractionsModule
import org.oppia.domain.classify.rules.continueinteraction.ContinueModule
import org.oppia.domain.classify.rules.fractioninput.FractionInputModule
import org.oppia.domain.classify.rules.itemselectioninput.ItemSelectionInputModule
import org.oppia.domain.classify.rules.multiplechoiceinput.MultipleChoiceInputModule
import org.oppia.domain.classify.rules.numberwithunits.NumberWithUnitsRuleModule
import org.oppia.domain.classify.rules.numericinput.NumericInputRuleModule
import org.oppia.domain.classify.rules.textinput.TextInputRuleModule
import org.oppia.util.logging.LoggerModule
import org.oppia.util.threading.DispatcherModule
import javax.inject.Provider
import javax.inject.Singleton

/** Root Dagger component for the application. All application-scoped modules should be included in this component. */
@Singleton
@Component(modules = [
  ApplicationModule::class, DispatcherModule::class, NetworkModule::class, LoggerModule::class,
  ContinueModule::class, FractionInputModule::class, ItemSelectionInputModule::class, MultipleChoiceInputModule::class,
  NumberWithUnitsRuleModule::class, NumericInputRuleModule::class, TextInputRuleModule::class, InteractionsModule::class
])
interface ApplicationComponent {
  @Component.Builder
  interface Builder {
    @BindsInstance fun setApplication(application: Application): Builder
    fun build(): ApplicationComponent
  }

  fun getActivityComponentBuilderProvider(): Provider<ActivityComponent.Builder>
}
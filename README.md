2022-04-11 21:58:58.182 24131-24131/com.lasha.hiltapp E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.lasha.hiltapp, PID: 24131
    java.lang.RuntimeException: Unable to start activity ComponentInfo{com.lasha.hiltapp/com.lasha.hiltapp.ui.MainActivity}: androidx.fragment.app.Fragment$InstantiationException: Unable to instantiate fragment com.lasha.hiltapp.ui.login.LoginFragment: calling Fragment constructor caused an exception
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3635)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3792)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:103)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2210)
        at android.os.Handler.dispatchMessage(Handler.java:106)
        at android.os.Looper.loopOnce(Looper.java:201)
        at android.os.Looper.loop(Looper.java:288)
        at android.app.ActivityThread.main(ActivityThread.java:7839)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:550)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)
     Caused by: androidx.fragment.app.Fragment$InstantiationException: Unable to instantiate fragment com.lasha.hiltapp.ui.login.LoginFragment: calling Fragment constructor caused an exception
        at androidx.fragment.app.Fragment.instantiate(Fragment.java:633)
        at androidx.fragment.app.FragmentContainer.instantiate(FragmentContainer.java:57)
        at androidx.fragment.app.FragmentManager$2.instantiate(FragmentManager.java:448)
        at androidx.navigation.fragment.FragmentNavigator.navigate(FragmentNavigator.kt:190)
        at androidx.navigation.fragment.FragmentNavigator.navigate(FragmentNavigator.kt:162)
        at androidx.navigation.NavGraphNavigator.navigate(NavGraphNavigator.kt:83)
        at androidx.navigation.NavGraphNavigator.navigate(NavGraphNavigator.kt:49)
        at androidx.navigation.NavController.navigateInternal(NavController.kt:261)
        at androidx.navigation.NavController.navigate(NavController.kt:1715)
        at androidx.navigation.NavController.onGraphCreated(NavController.kt:1158)
        at androidx.navigation.NavController.setGraph(NavController.kt:1086)
        at androidx.navigation.NavController.setGraph(NavController.kt:1039)
        at androidx.navigation.fragment.NavHostFragment.onCreate(NavHostFragment.kt:155)
        at androidx.fragment.app.Fragment.performCreate(Fragment.java:2981)
        at androidx.fragment.app.FragmentStateManager.create(FragmentStateManager.java:474)
        at androidx.fragment.app.FragmentStateManager.moveToExpectedState(FragmentStateManager.java:257)
        at androidx.fragment.app.FragmentStore.moveToExpectedState(FragmentStore.java:113)
        at androidx.fragment.app.FragmentManager.moveToState(FragmentManager.java:1374)
        at androidx.fragment.app.FragmentManager.dispatchStateChange(FragmentManager.java:2841)
        at androidx.fragment.app.FragmentManager.dispatchCreate(FragmentManager.java:2773)
        at androidx.fragment.app.FragmentController.dispatchCreate(FragmentController.java:251)
        at androidx.fragment.app.FragmentActivity.onCreate(FragmentActivity.java:252)
        at android.app.Activity.performCreate(Activity.java:8050)
        at android.app.Activity.performCreate(Activity.java:8030)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1335)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3608)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3792)??
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:103)??
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)??
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)??
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2210)??
        at android.os.Handler.dispatchMessage(Handler.java:106)??
        at android.os.Looper.loopOnce(Looper.java:201)??
        at android.os.Looper.loop(Looper.java:288)??
        at android.app.ActivityThread.main(ActivityThread.java:7839)??
        at java.lang.reflect.Method.invoke(Native Method)??
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:550)??
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)??
     Caused by: java.lang.reflect.InvocationTargetException
        at java.lang.reflect.Constructor.newInstance0(Native Method)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:343)
        at androidx.fragment.app.Fragment.instantiate(Fragment.java:615)
        at androidx.fragment.app.FragmentContainer.instantiate(FragmentContainer.java:57)??
        at androidx.fragment.app.FragmentManager$2.instantiate(FragmentManager.java:448)??
        at androidx.navigation.fragment.FragmentNavigator.navigate(FragmentNavigator.kt:190)??
        at androidx.navigation.fragment.FragmentNavigator.navigate(FragmentNavigator.kt:162)??
        at androidx.navigation.NavGraphNavigator.navigate(NavGraphNavigator.kt:83)??
        at androidx.navigation.NavGraphNavigator.navigate(NavGraphNavigator.kt:49)??
        at androidx.navigation.NavController.navigateInternal(NavController.kt:261)??
        at androidx.navigation.NavController.navigate(NavController.kt:1715)??
        at androidx.navigation.NavController.onGraphCreated(NavController.kt:1158)??
        at androidx.navigation.NavController.setGraph(NavController.kt:1086)??
        at androidx.navigation.NavController.setGraph(NavController.kt:1039)??
        at androidx.navigation.fragment.NavHostFragment.onCreate(NavHostFragment.kt:155)??
        at androidx.fragment.app.Fragment.performCreate(Fragment.java:2981)??
        at androidx.fragment.app.FragmentStateManager.create(FragmentStateManager.java:474)??
        at androidx.fragment.app.FragmentStateManager.moveToExpectedState(FragmentStateManager.java:257)??
        at androidx.fragment.app.FragmentStore.moveToExpectedState(FragmentStore.java:113)??
        at androidx.fragment.app.FragmentManager.moveToState(FragmentManager.java:1374)??
        at androidx.fragment.app.FragmentManager.dispatchStateChange(FragmentManager.java:2841)??
        at androidx.fragment.app.FragmentManager.dispatchCreate(FragmentManager.java:2773)??
        at androidx.fragment.app.FragmentController.dispatchCreate(FragmentController.java:251)??
        at androidx.fragment.app.FragmentActivity.onCreate(FragmentActivity.java:252)??
        at android.app.Activity.performCreate(Activity.java:8050)??
        at android.app.Activity.performCreate(Activity.java:8030)??
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1335)??
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3608)??
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3792)??
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:103)??
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)??
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)??
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2210)??
        at android.os.Handler.dispatchMessage(Handler.java:106)??
        at android.os.Looper.loopOnce(Looper.java:201)??
        at android.os.Looper.loop(Looper.java:288)??
        at android.app.ActivityThread.main(ActivityThread.java:7839)??
        at java.lang.reflect.Method.invoke(Native Method)??
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:550)??
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)??
     Caused by: java.lang.IllegalStateException: Can't access ViewModels from detached fragment
        at androidx.fragment.app.Fragment.getViewModelStore(Fragment.java:400)
2022-04-11 21:58:58.182 24131-24131/com.lasha.hiltapp E/AndroidRuntime:     at androidx.lifecycle.ViewModelProvider.<init>(ViewModelProvider.java:99)
        at com.lasha.hiltapp.ui.login.LoginFragment.<init>(LoginFragment.kt:15)
        	... 40 more
2022-04-11 21:58:58.190 24131-24131/com.lasha.hiltapp I/Process: Sending signal. PID: 24131 SIG: 9

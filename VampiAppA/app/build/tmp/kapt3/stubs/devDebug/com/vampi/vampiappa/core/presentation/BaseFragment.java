package com.vampi.vampiappa.core.presentation;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.vampi.vampiappa.R;
import com.vampi.vampiappa.core.exception.Failure;

/**
 * Created by Amalip on 9/27/2021.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\r\u0010\u0015\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\b\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H&J\r\u0010 \u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\b!J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\u0004H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J)\u0010+\u001a\b\u0012\u0004\u0012\u0002H-0,\"\n\b\u0000\u0010-\u0018\u0001*\u00020.*\u00020\u00012\b\b\u0001\u0010/\u001a\u00020\u0004H\u0086\bR\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\u00a8\u00060"}, d2 = {"Lcom/vampi/vampiappa/core/presentation/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/vampi/vampiappa/core/presentation/OnFailure;", "layoutId", "", "(I)V", "baseActivity", "Lcom/vampi/vampiappa/core/presentation/BaseActivity;", "getBaseActivity", "()Lcom/vampi/vampiappa/core/presentation/BaseActivity;", "baseActivity$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "handleFailure", "", "failure", "Lcom/vampi/vampiappa/core/exception/Failure;", "hideKeyboard", "hideKeyboard$VampiAppA_v1_1_0__devDebug", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onViewStateChanged", "state", "Lcom/vampi/vampiappa/core/presentation/BaseViewState;", "setBinding", "showKeyboard", "showKeyboard$VampiAppA_v1_1_0__devDebug", "showLoader", "show", "", "showToast", "message", "", "statusBarColor", "windowBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "hiltNavGraphViewModels", "Lkotlin/Lazy;", "T", "Landroidx/lifecycle/ViewModel;", "navGraphIdRes", "VampiAppA_v1(1.0)_devDebug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements com.vampi.vampiappa.core.presentation.OnFailure {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navController$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy baseActivity$delegate = null;
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vampi.vampiappa.core.presentation.BaseActivity getBaseActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void setBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public void onViewStateChanged(@org.jetbrains.annotations.Nullable()
    com.vampi.vampiappa.core.presentation.BaseViewState state) {
    }
    
    public final void hideKeyboard$VampiAppA_v1_1_0__devDebug() {
    }
    
    public final void showKeyboard$VampiAppA_v1_1_0__devDebug() {
    }
    
    public void showLoader(boolean show) {
    }
    
    public int statusBarColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.graphics.drawable.Drawable windowBackgroundDrawable() {
        return null;
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    @java.lang.Override()
    public void handleFailure(@org.jetbrains.annotations.Nullable()
    com.vampi.vampiappa.core.exception.Failure failure) {
    }
}
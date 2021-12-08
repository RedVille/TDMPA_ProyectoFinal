package com.vampi.vampiappa.core.presentation;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import com.vampi.vampiappa.core.exception.Failure;

/**
 * Created by Amalip on 9/27/2021.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\r\u0010\f\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\rJ\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H&J\r\u0010\u0016\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/vampi/vampiappa/core/presentation/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/vampi/vampiappa/core/presentation/OnFailure;", "()V", "fragmentContainer", "Landroidx/fragment/app/FragmentContainerView;", "getFragmentContainer", "()Landroidx/fragment/app/FragmentContainerView;", "handleFailure", "", "failure", "Lcom/vampi/vampiappa/core/exception/Failure;", "hideKeyBoard", "hideKeyBoard$VampiAppA_v1_1_0__devDebug", "layoutId", "", "setBinding", "setBottomNavVisibility", "visibility", "setUpNavigation", "navController", "Landroidx/navigation/NavController;", "showKeyBoard", "showKeyBoard$VampiAppA_v1_1_0__devDebug", "showProgress", "show", "", "VampiAppA_v1(1.0)_devDebug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.vampi.vampiappa.core.presentation.OnFailure {
    
    public BaseActivity() {
        super();
    }
    
    public abstract int layoutId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.fragment.app.FragmentContainerView getFragmentContainer();
    
    public final void hideKeyBoard$VampiAppA_v1_1_0__devDebug() {
    }
    
    public final void showKeyBoard$VampiAppA_v1_1_0__devDebug() {
    }
    
    public abstract void setUpNavigation(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController);
    
    @java.lang.Override()
    public void handleFailure(@org.jetbrains.annotations.Nullable()
    com.vampi.vampiappa.core.exception.Failure failure) {
    }
    
    public abstract void showProgress(boolean show);
    
    public abstract void setBottomNavVisibility(int visibility);
    
    public abstract void setBinding();
}
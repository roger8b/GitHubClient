package br.com.rms.githubclient;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

/**
 * Primeira classe criada.
 * Aqui vamos criar e armazenar o AppComponent
 * Com isso todos os objetos de instancia unica existiram enquanto
 * o objeto Application existir (O ciclo de vida do aplicativo)
 */

public class GitHubClientApplication extends Application {

    private AppComponent appComponent;
    private UserComponent userComponent;

    public static GitHubClientApplication get(Context context){
        return (GitHubClientApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }

        initAppComponent();
    }

    private void initAppComponent() {
        /*appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();*/

    }
}

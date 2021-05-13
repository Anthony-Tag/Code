import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeroListComponent } from './hero-list/hero-list.component';
import { StarComponent } from './star/star.component';
import { PrependPipe } from './shared/prepend.pipe';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProfileComponent } from './profile/profile.component';
import { RouterModule } from '@angular/router';
import {HttpClientModule} from "@angular/common/http";
import { LoginComponent } from './login/login.component';

@NgModule({ 
  declarations: [ //This will hold our references to our componenets
    AppComponent,
    HeroListComponent,
    StarComponent,
    PrependPipe,
    WelcomeComponent,
    ProfileComponent,
    LoginComponent
  ],
  imports: [ //This is where we reference the node_modules
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule, //Whenever you do a reactive form you have to import this


    RouterModule.forRoot([
      {path: "superheroes", component: HeroListComponent},
      {path: "welcome", component: WelcomeComponent},
      {path: "profile/:heroname", component: ProfileComponent},
      {path: "login", component:LoginComponent}
    ])
  ],
  providers: [], //This is where we reference services
  bootstrap: [AppComponent] //This is the first loaded component/code in the Angular application
})
export class AppModule { }

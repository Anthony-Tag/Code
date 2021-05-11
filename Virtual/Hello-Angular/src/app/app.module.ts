import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeroListComponent } from './hero-list/hero-list.component';
import { StarComponent } from './star/star.component';

@NgModule({
  declarations: [
    AppComponent,
    HeroListComponent,
    StarComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

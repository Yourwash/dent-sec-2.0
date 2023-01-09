import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HeaderComponent} from './header/header.component';
import {DarkModeDirective} from './Directives/dark-mode.directive';
import {ShowDirective} from './Directives/show.directive';
import {HideDirective} from './Directives/hide.directive';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DarkModeDirective,
    ShowDirective,
    HideDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ReactiveFormsModule,

  ],
  providers: [],
  exports: [
    HideDirective,
    ShowDirective
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}

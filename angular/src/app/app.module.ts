import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { UploadComponent } from './upload/upload.component';
import { MenuComponent } from './menu/menu.component';
import { SearchResultComponent } from './search-result/search-result.component';
import { LoginComponent } from './login/login.component';
import { ProductBaseComponent } from './product-base/product-base.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductEntryComponent } from './product-entry/product-entry.component';
import { LogoutComponent } from './logout/logout.component';
import { ErrorComponent } from './error/error.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    UploadComponent,
    MenuComponent,
    SearchResultComponent,
    LoginComponent,
    ProductBaseComponent,
    ProductListComponent,
    ProductEntryComponent,
    LogoutComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

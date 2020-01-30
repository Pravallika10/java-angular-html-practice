import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { UploadComponent } from './upload/upload.component';
import { SearchResultComponent } from './search-result/search-result.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGaurdService } from './services/auth-gaurd.service';
import { ErrorComponent } from './error/error.component';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductAddComponent } from './product/product-add/product-add.component';

const routes: Routes = [
  {path:"", redirectTo : "home", pathMatch: "full"},
  {path:"home",component:HomeComponent},
  {path:"contact",component:ContactComponent},
  {path:"upload",component:UploadComponent},
  {path:"search/:searchText", component: SearchResultComponent},
  {path:"login", component: LoginComponent},
  { path:"product", component: ProductListComponent, canActivate :  [AuthGaurdService]},
  { path:"product-add", component: ProductAddComponent, canActivate : [AuthGaurdService]},
  {path:"logout", component: LogoutComponent, canActivate : [AuthGaurdService]},
  { path:"**", component: ErrorComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

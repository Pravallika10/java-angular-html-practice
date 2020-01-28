import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { UploadComponent } from './upload/upload.component';
import { SearchResultComponent } from './search-result/search-result.component';


const routes: Routes = [
  {path:"", redirectTo : "home", pathMatch: "full"},
  {path:"home",component:HomeComponent},
  {path:"contact",component:ContactComponent},
  {path:"upload",component:UploadComponent},
  { path:"search/:searchText", component: SearchResultComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

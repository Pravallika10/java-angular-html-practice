import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FormmodelviewComponent } from './formmodelview/formmodelview.component';
import { FormtemplateComponent } from './formtemplate/formtemplate.component';

@NgModule({
  declarations: [
    AppComponent,
    FormmodelviewComponent,
    FormtemplateComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

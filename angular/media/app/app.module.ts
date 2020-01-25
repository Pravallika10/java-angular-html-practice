import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediafileComponent } from './mediafile/mediafile.component';
import { MediadisplayComponent } from './mediadisplay/mediadisplay.component';

@NgModule({
  declarations: [
    AppComponent,
    MediafileComponent,
    MediadisplayComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

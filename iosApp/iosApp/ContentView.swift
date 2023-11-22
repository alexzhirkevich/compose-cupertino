import UIKit
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
        
    private var component : RootComponent
    
    init(component : RootComponent){
        self.component = component
    }
    
    func makeUIViewController(context: Context) -> UIViewController {
        Main_iosKt.MainViewController(component : component)
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    
    private var component : RootComponent
    
    init(component : RootComponent){
        self.component = component
    }
    
    var body: some View {
        ComposeView(component: component)
                .ignoresSafeArea()
    }
}




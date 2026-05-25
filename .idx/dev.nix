# To learn more about how to use Nix to configure your environment
# see: https://developers.google.com/idx/guides/customize-idx-env
{ pkgs, ... }: {
  # Which nixpkgs channel to use.
  channel = "stable-23.11"; # or "unstable"

  # Use https://search.nixos.org/packages to find packages
  packages = [
    pkgs.jdk21          # Java 21 
    pkgs.gradle         # Gestor de dependencias
  ];

  # Sets environment variables in the workspace
  env = {};

  idx = {
    # Search for the extensions you want on https://open-vsx.org/ and use "publisher.id"
    extensions = [
      "vscjava.vscode-java-pack"            
      "k--kato.intellij-idea-keybindings"   
      "mguenther.intellij-darcula"          
      "GabrielBB.vscode-lombok"             
      "redhat.java"
      "vscjava.vscode-gradle"
      "vscjava.vscode-java-debug"
    ];

    # Configuración de los ciclos de vida del espacio de trabajo
    workspace = {
      # Se ejecuta una sola vez cuando se crea el entorno
      onCreate = {
        install = "gradle build -x test"; 
      };
      onStart = {
        run-build = "gradle compileJava"; 
      };
    };
  };
}
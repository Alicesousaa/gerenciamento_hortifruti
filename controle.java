package projetpi;

import java.util.Scanner;

public class pi {


        public static void precoDior() {
        float dior_preco = 1015.00f;
            System.out.println("O valor da sua compra foi de: R$"+ dior_preco + "\n");
        }
        
        public static void precoGassi() {
        float gassi_preco = 98.00f;
            System.out.println("O valor da sua compra foi de: R$ " + gassi_preco + "\n");
        }
        
        public static void precoRayban() {
        float rayban_preco = 558.00f; 
            System.out.println("O valor da sua compra foi de: R$ " + rayban_preco + "\n");
        }

        public static void apresentaçao() {
            
            //APRESENTANDO A LOJA
            System.out.print("\n*****************************************\n");
            System.out.print("               ♡ BEM-VINDOS ♡ \n");
            System.out.print("\n           VISIONS MULTIPLES CHIC\n");
            System.out.print("*******************************************\n");
            System.out.println("DIGITE O NÚMERO DA MARCA E MODELO DESEJADO");
            System.out.print("*******************************************\n");

        }
        
        
        //UMA FUNÇÃO PARA DAR A OPÇÃO DE MARCA E MODELO DO ÓCULOS
        public static String PrimeiraEscolha() {
        Scanner sc = new Scanner(System.in);
        String resposta_modelo_desejada;
      
        
        //"DO" PARA FAZER ANTES DE ANALISAR, DEPOIS ELE VAI REPETIR SE O NUMERO DIFITADO NÃO ESTIVER CERTO
        do {
           //OPÇÕES 
            System.out.print("\nRAYBAN");
            System.out.print("\n1. Redondo\n2. Quadrado\n3. Hexagonal\n");
            System.out.print("\nDIOR");
            System.out.print("\n4. Redondo\n5. Quadrado\n6. Hexagonal\n");
            System.out.print("\nGASSI");
            System.out.print("\n7. Redondo\n8. Quadrado\n9. Hexagonal\n");
            System.out.print("\n10. SAIR.\n");
            System.out.print("\nOPÇÃO: ");
            resposta_modelo_desejada = sc.next();
            
            
        //VAI REPETIR ATÉ O USUARIO COLOCAR UM NUMERO QUE ESTEJA ENTE 1 E 10
        } while (!resposta_modelo_desejada.equals("1") && 
                 !resposta_modelo_desejada.equals("2") && 
                 !resposta_modelo_desejada.equals("3") && 
                 !resposta_modelo_desejada.equals("4") && 
                 !resposta_modelo_desejada.equals("5") && 
                 !resposta_modelo_desejada.equals("6") && 
                 !resposta_modelo_desejada.equals("7") && 
                 !resposta_modelo_desejada.equals("8") && 
                 !resposta_modelo_desejada.equals("9") && 
                 !resposta_modelo_desejada.equals("10"));

        return resposta_modelo_desejada;
    }


    public static String EscolhaCor(String resposta_modelo_desejada) {
        Scanner sc = new Scanner(System.in);
        String resposta_cor_desejada = "";
        

        switch (resposta_modelo_desejada) {
            case "1" :{
                do {
                    System.out.print("\nEscolha a cor:\n1. Rayban Redondo Prata\n2. Rayban Redondo Dourado\n3. Rayban Redondo Colorido\n4. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"1".equals(resposta_cor_desejada) && !"2".equals(resposta_cor_desejada) && !"3".equals(resposta_cor_desejada) && !"4".equals(resposta_cor_desejada));
                break;
            }

            case "2":{
                do {
                    System.out.print("\nEscolha a cor:\n5. Rayban Quadrado Prata\n6. Rayban Quadrado Dourado\n7. Rayban Quadrado Colorido\n8. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"5".equals(resposta_cor_desejada) && !"6".equals(resposta_cor_desejada) && !"7".equals(resposta_cor_desejada) && !"8".equals(resposta_cor_desejada));
                break;
            }

            case "3":{
                do {
                    System.out.print("\nEscolha a cor:\n9. Rayban Hexagonal Prata\n10. Rayban Hexagonal Dourado\n11. Rayban Hexagonal Colorido\n12. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"9".equals(resposta_cor_desejada) && !"10".equals(resposta_cor_desejada) && !"11".equals(resposta_cor_desejada) && !"12".equals(resposta_cor_desejada));
                break;
            }

            case "4":{
                do {
                    System.out.print("\nEscolha a cor:\n13. Dior Redondo Prata\n14. Dior Redondo Dourado\n15. Dior Redondo Colorido\n16. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"13".equals(resposta_cor_desejada) && !"14".equals(resposta_cor_desejada) && !"15".equals(resposta_cor_desejada) && !"16".equals(resposta_cor_desejada));
                break;
            }

            case "5":{
                do {
                    System.out.print("\nEscolha a cor:\n17. Dior Quadrado Prata\n18. Dior Quadrado Dourado\n19. Dior Quadrado Colorido\n20. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"17".equals(resposta_cor_desejada) && !"18".equals(resposta_cor_desejada) && !"19".equals(resposta_cor_desejada) && !"20".equals(resposta_cor_desejada));
                break;
            }

            case "6":{
                do {
                    System.out.print("\nEscolha a cor:\n21. Dior Hexagonal Prata\n22. Dior Hexagonal Dourado\n23. Dior Hexagonal Colorido\n24. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"21".equals(resposta_cor_desejada) && !"22".equals(resposta_cor_desejada) && !"23".equals(resposta_cor_desejada) && !"24".equals(resposta_cor_desejada));
                break;
            }

            case "7":{
                do {
                    System.out.print("\nEscolha a cor:\n25. Gassi Redondo Prata\n26. Gassi Redondo Dourado\n27. Gassi Redondo Colorido\n28. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"25".equals(resposta_cor_desejada) && !"26".equals(resposta_cor_desejada) && !"27".equals(resposta_cor_desejada) && !"28".equals(resposta_cor_desejada));
                break;
            }

            case "8":{
                do {
                    System.out.print("\nEscolha a cor:\n29. Gassi Quadrado Prata\n30. Gassi Quadrado Dourado\n31. Gassi Quadrado Colorido\n32. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"29".equals(resposta_cor_desejada) && !"30".equals(resposta_cor_desejada) && !"31".equals(resposta_cor_desejada) && !"32".equals(resposta_cor_desejada));
                break;
            }

            case "9":{
                do {
                    System.out.print("\nEscolha a cor:\n33. Gassi Hexagonal Prata\n34. Gassi Hexagonal Dourado\n35. Gassi Hexagonal Colorido\n36. SAIR.\n\nOPÇÃO: ");
                    resposta_cor_desejada = sc.next();
                } while (!"33".equals(resposta_cor_desejada) && !"34".equals(resposta_cor_desejada) && !"35".equals(resposta_cor_desejada) && !"36".equals(resposta_cor_desejada));
                break;
            }

            case "10":{
                System.out.println("Saindo do programa.\n");
                break;

            }
        }
        return resposta_cor_desejada;
    }

    public static void FinaldaCompra(float precoDior,float Gassi,float precoRayban,String resposta_cor_desejada) {
                
         // RAYBAN REDONDO 
         int rayban_redondo_prata_estoque = 30;
         int rayban_redondo_dourado_estoque = 30;
         int rayban_redondo_colorido_estoque = 40;
         
         //RAYBAN QUADRADO 
         int rayban_quadrado_prata_estoque = 15;
         int rayban_quadrado_colorido_estoque = 30;
         int rayban_quadrado_dourado_estoque = 40;
         
         //RAYBAN HEXAGONAL
         int rayban_hexagonal_prata_estoque = 30;
         int rayban_hexagonal_dourado_estoque = 20;
         int rayban_hexagonal_colorido_estoque = 20;
         
         //DIOR REDONDO
         int dior_redondo_prata_estoque = 70;
         int dior_redondo_dourado_estoque = 70;
         int dior_redondo_colorido_estoque = 60;
         
         //DIOR QUADRADO
         int dior_quadrado_prata_estoque = 30;
         int dior_quadrado_dourado_estoque = 30;
         int dior_quadrado_colorido_estoque = 50;
         
         //DIOR HEXAGONAL
         int dior_hexagonal_prata_estoque = 66;
         int dior_hexagonal_dourado_estoque = 55;
         int dior_hexagonal_colorido_estoque = 77;
         
         //GASSI REDONDO
         int gassi_redondo_prata_estoque = 75;
         int gassi_redondo_dourado_estoque = 65;
         int gassi_redondo_colorido_estoque = 60;
         
         //GASSI QUADRADO
         int gassi_quadrado_prata_estoque = 55;
         int gassi_quadrado_dourado_estoque = 66;
         int gassi_quadrado_colorido_estoque = 75;
         
         //GASSI HEXAGONAL 
         int gassi_hexagonal_prata_estoque = 55;
         int gassi_hexagonal_dourado_estoque = 77;
         int gassi_hexagonal_colorido_estoque = 65;
         

        switch (resposta_cor_desejada) {
            case "1": 
                if (rayban_redondo_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Redondo Prata\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();

                    // Atualizando o estoque
                    rayban_redondo_prata_estoque = rayban_redondo_prata_estoque - 1;// Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_redondo_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Redondo Prata"); 
                }
                break;
            

            case "2" : 
                if (rayban_redondo_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Redondo Dourado\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_redondo_dourado_estoque = rayban_redondo_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_redondo_dourado_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Redondo Dourado");
                }
                break;
            

            case "3": 
                if (rayban_redondo_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Redondo Colorido\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_redondo_colorido_estoque = rayban_redondo_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_redondo_colorido_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Redondo Colorido");  
                }
                break;
            

            case "4":
                System.out.println("Saindo do programa.\n");
                break;
            
            case "5": 
                if (rayban_quadrado_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Quadrado Prata\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_quadrado_prata_estoque = rayban_quadrado_prata_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_quadrado_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Quadrado Prata");     
                }
                break;
            

            case "6":
                if (rayban_quadrado_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Quadrado Dourado\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_quadrado_dourado_estoque = rayban_quadrado_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_quadrado_dourado_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Quadrado Dourado");                   
                }
                break;
            

            case "7":
                if (rayban_quadrado_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Quadrado Colorido\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_quadrado_colorido_estoque = rayban_quadrado_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_quadrado_colorido_estoque + " Óculos.\n");
               
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Quadrado Colorido");
                                    }
                break;
            

            case "8":
                System.out.print("Saindo do programa.\n");
                break;
            
            case "9":
                if (rayban_hexagonal_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Hexagonal Prata\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_hexagonal_prata_estoque = rayban_hexagonal_prata_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_hexagonal_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Hexagonal Prata");      
                }
               break;
            
               
            case "10":
                if (rayban_hexagonal_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Hexagonal Dourado\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_hexagonal_dourado_estoque = rayban_hexagonal_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_hexagonal_dourado_estoque + " Óculos.\n");
               
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Hexagonal Dourado");
                }
               break;
            

            case "11":
                if (rayban_hexagonal_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Rayban Hexagonal Colorido\n");
                    //Iniciando outra função
                    precoRayban();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    rayban_hexagonal_colorido_estoque = rayban_hexagonal_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + rayban_hexagonal_colorido_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Rayban Hexagonal Colorido");    
                }
                break;
            
                
            case "12":
                System.out.print("Saindo do programa.\n");
                break;
             
                
            case "13":
                if (dior_redondo_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Redondo Prata\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_redondo_prata_estoque = dior_redondo_prata_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_redondo_prata_estoque + " Óculos.\n");
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Redondo Prata");  
                }
                break;
            
            case "14":
                if (dior_redondo_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Redondo Dourado\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_redondo_dourado_estoque = dior_redondo_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_redondo_dourado_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Redondo Dourado");     
                }
                break;
            

            case "15":
                if (dior_redondo_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Redondo Colorido\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_redondo_colorido_estoque = dior_redondo_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_redondo_colorido_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Redondo Colorido");   
                }
               
            

            case "16":
                System.out.print("Saindo do programa.\n");
                break;
            
            case "17":
                if (dior_quadrado_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Quadrado Prata\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_quadrado_prata_estoque = dior_quadrado_prata_estoque - 1; 
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_quadrado_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Quadrado Prata");     
                }
                break;
            

            case "18":
                if (dior_quadrado_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Quadrado Dourado\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_quadrado_dourado_estoque = dior_quadrado_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_quadrado_dourado_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Quadrado Dourado");    
                }
                break;
            
            case "19":
                if (dior_quadrado_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Quadrado Colorido\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_quadrado_colorido_estoque = dior_quadrado_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_quadrado_colorido_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Quadrado Colorido");    
                }
                
  
            case "20":
                System.out.print("Saindo do programa.\n");
                break;
            
            case "21":
                if (dior_hexagonal_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Hexagonal Prata\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_hexagonal_prata_estoque = dior_hexagonal_prata_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_hexagonal_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Hexagonal Prata"); 
                }
                
 
            case "22":
                if (dior_hexagonal_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Hexagonal Dourado\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_hexagonal_dourado_estoque = dior_hexagonal_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_hexagonal_dourado_estoque + " Óculos.\n");
               
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Hexagonal Dourado");    
                }
                break;
            

            case "23":
                if (dior_hexagonal_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Dior Hexagonal Colorido\n");
                    //Iniciando outra função
                    precoDior();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    dior_hexagonal_colorido_estoque = dior_hexagonal_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + dior_hexagonal_colorido_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Dior Hexagonal Colorido");      
                }
                break;

            case "24":
                System.out.print("Saindo do programa.\n");
                break;
            
            case "25":
                if (gassi_redondo_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Redondo Prata\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    gassi_redondo_prata_estoque = gassi_redondo_prata_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_redondo_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Redondo Prata");      
                }
                break;
            

            case "26":
                if (gassi_redondo_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Redondo Dourado\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_redondo_dourado_estoque = gassi_redondo_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_redondo_dourado_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Redondo Dourado");    
                }
            
            

            case "27":
                if (gassi_redondo_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Redondo Colorido\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_redondo_colorido_estoque = gassi_redondo_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_redondo_colorido_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Redondo Colorido"); 
                }
                break;
            

            case "28":
                System.out.print("Saindo do programa.\n");
                break;
            
            
            case "29":
                if (gassi_quadrado_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Quadrado Prata\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_quadrado_prata_estoque = gassi_quadrado_prata_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_quadrado_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Quadrado Prata");     
                }
                break;
            

            case "30":
                if (gassi_quadrado_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Quadrado Dourado\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_quadrado_dourado_estoque = gassi_quadrado_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_quadrado_dourado_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Quadrado Dourado");      
                }
                break;
            

            case "31":
                if (gassi_quadrado_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Quadrado Colorido\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_quadrado_colorido_estoque = gassi_quadrado_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_quadrado_colorido_estoque + " Óculos.\n");

                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Quadrado Colorido");
                }
                break;
            

            case "32":
                System.out.print("Saindo do programa.\n");
                break;
            
            
            case "33":
                if (gassi_hexagonal_prata_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Hexagonal Prata\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_hexagonal_prata_estoque = gassi_hexagonal_prata_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_hexagonal_prata_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Hexagonal Prata");
                }
                        
            case "34":
                if (gassi_hexagonal_dourado_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Hexagonal Dourado\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_hexagonal_dourado_estoque = gassi_hexagonal_dourado_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_hexagonal_dourado_estoque + " Óculos.\n");
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Hexagonal Dourado");
                }
                break;
            

            case "35":
                if (gassi_hexagonal_colorido_estoque > 0) {
                    System.out.print("\nSua compra foi: 1 Óculos Gassi Hexagonal Colorido\n");
                    //Iniciando outra função
                    precoGassi();
                    //Iniciando outra função
                    confirmarCompra();
                    
                    // Atualizando o estoque
                    gassi_hexagonal_colorido_estoque = gassi_hexagonal_colorido_estoque - 1; // Atualizando o estoque
                    System.out.print("\nQuantidade atualizada no estoque: " + gassi_hexagonal_colorido_estoque + " Óculos.\n");
                
                } else {
                    System.out.println("Estoque esgotado para: Óculos Gassi Hexagonal Colorido"); 
                }
                break;
            
            case "36":
                     System.out.print("Saindo do programa.\n");
                    break;
        }
      
    }

    public static void confirmarCompra() {
        String confirmar_compra;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Você confirma a compra?\n1. Sim.\n2. Não.\n\nOPÇÃO: ");
                confirmar_compra = sc.next();             
        }while(!"1".equals(confirmar_compra) && !"2".equals(confirmar_compra));
        
        if ("1".equals(confirmar_compra)) {
            escolherFormaDePagamento();
        } else if ("2".equals(confirmar_compra)) {
            System.out.println("\nCOMPRA CANCELADA\nPROGRAMA ENCERRADO\n");
        }      
    }

    public static void escolherFormaDePagamento() {
        Scanner sc = new Scanner(System.in);
        String pagamento;
        do{
            System.out.print("\nDigite a forma de pagamento:\n1. Pix\n2. Crédito\n3. Débito\n\nOPÇÃO: ");
                pagamento = sc.next();
        }while(!"3".equals(pagamento) && !"2".equals(pagamento) && !"1".equals(pagamento));
        
        switch (pagamento) {
            
            case "1": 
                pagamentoViaPix();
            break;
            
            case "2":
                pagamentoComCartaoCredito();
            break;
            
            case "3":
                pagamentoComCartaoDebito();
            break;
        }
    }

    public static void pagamentoViaPix() {
        Scanner sc = new Scanner(System.in);
        String confirmar_transferencia;
        String ColorCode1 = "\u001B[31m";
        String ColorCode2 = "\u001B[32m";
        String resetColorCode = "\u001B[0m";
        
        System.out.println("\nVocê escolheu o pagamento via Pix\nA chave é: 1545@!x1544vf1f55d@@@hh");
        
        do{
            System.out.print("Você confirma a transferência?\n1. Sim.\n2. Não.\n\nOPÇÃO:");
                 confirmar_transferencia = sc.next();
        }while(!"1".equals(confirmar_transferencia) && !"2".equals(confirmar_transferencia));

        if ("1".equals(confirmar_transferencia)) {
            System.out.println(ColorCode2+ "\nPAGAMENTO CONCLUÍDO.\n" +resetColorCode);
            System.out.println("Obrigado por comprar conosco.\n");
            System.out.println("****** VOLTE SEMPRE ******");
            
        } else if ("2".equals(confirmar_transferencia)) {
            System.out.println("\n" +ColorCode1+ "PAGAMENTO NEGADO.\n" +resetColorCode);
            
        }else {
            System.out.println("\nOPÇÃO INVÁLIDA.\n");
        }
    }

    public static void pagamentoComCartaoCredito() {
        Scanner sc = new Scanner(System.in);
        String ColorCode1 = "\u001B[31m";
        String ColorCode2 = "\u001B[32m";
        String resetColorCode = "\u001B[0m";
        int contador = 0;   
        
        System.out.print("\nVocê escolheu fazer o pagamento através do cartão de crédito\nInsira a senha: ");
        String senha = sc.next();
        
        while(!"123456".equals(senha) && contador <3){
            System.out.println("\n" +ColorCode1+ "SENHA INCORRETA" +resetColorCode+ "\nVOCÊ TEM "+ (3-contador) +" TENTATIVAS RESTANTES.");
            System.out.print("1"
                    + "\nInsira a senha: ");
            contador ++;
            senha = sc.next();
           
        }
        if ("123456".equals(senha)) {
            
            System.out.println(ColorCode2+ "PAGAMENTO APROVADO." +resetColorCode+ "\n");
            System.out.println("Obrigado por comprar conosco.");
            System.out.println("****** VOLTE SEMPRE ******");
        } else {
            System.out.println(ColorCode1+"SENHA INCORRETA" +resetColorCode+ "\n CARTÃO BLOQUEADO.");
            
        }
    }

    public static void pagamentoComCartaoDebito() {
        Scanner sc = new Scanner(System.in);
        String ColorCode1 = "\u001B[31m";
        String ColorCode2 = "\u001B[32m";
        String resetColorCode = "\u001B[0m";
        int contador = 0;
        
        System.out.print("\nVocê escolheu fazer o pagamento através do cartão de débito\nInsira a senha: ");
        String senha = sc.next();

        while(!"123456".equals(senha) && contador <3){
            System.out.println("\n"+ColorCode1+"SENHA INCORRETA."+resetColorCode+"\nVOCÊ TEM "+ (3-contador) +" TENTATIVAS RESTANTES.");
            System.out.print("\n Insira a senha: ");
            contador ++;
            senha = sc.next();
           
        }if ("123456".equals(senha)) {
            
            System.out.println(ColorCode1+"PAGAMENTO APROVADO."+resetColorCode);
            System.out.println("Obrigado por comprar conosco.");
            System.out.println("****** VOLTE SEMPRE ******");
        
        } else {
            System.out.println(ColorCode1+"SENHA INCORRETA" +resetColorCode+ "\n CARTÃO BLOQUEADO.");
        }
    }
     
    public static void main(String[] args) {
        
        // Aparece a apresentação da loja    
        apresentaçao(); 
        
        // Aparece a escolha do modelo
        String modelo = PrimeiraEscolha();

        // Aparece a escolha da cor
        String cor1 = EscolhaCor(modelo);

        // Finaliza a compra
        FinaldaCompra(0, 0, 0, cor1);

}
    }
package org.vinnivso;

import org.vinnivso.dao.ClientSetDAO;
import org.vinnivso.dao.IClientDAO;
import org.vinnivso.domain.Client;

import javax.swing.*;

public class App {
    private static IClientDAO iClientDAO;

    public static void main(String[] args) {
        iClientDAO = new ClientSetDAO();

        //JOptionPane mostra as telas de swing no JAVA.
        String option = JOptionPane.showInputDialog(null, "1 - Register, 2 - Search, 3 - Remove, 4 - Update and 5 - Exit", "Green dinner", JOptionPane.INFORMATION_MESSAGE);

        //Enquanto a opção for inválida, será requisitado e demonstrará as telas de swing do JAVA.
        while (!isValidOption(option)) {
            if ("".equals(option)) {
                exit();
            }
            option = JOptionPane.showInputDialog(null,
                    "1 - Register, 2 - Search, 3 - Remove, 4 - Update and 5 - Exit",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }


        //Enquanto estiver rodando da opção 1-5, ficará no fluxo abaixo.
        while (isValidOption(option)) {

            if (isExitOption(option)) {
                exit();
            }else if (isRegister(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Please, inform the client data separated by ','. As the followed example: Name, SSN, Telephone, Address, Adrdress Number, City and State",
                        "Register", JOptionPane.INFORMATION_MESSAGE);
                search(data);
            } else if (isSearch(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Please, inform the SSN's client",
                        "Search for the Client", JOptionPane.INFORMATION_MESSAGE);
                search(data);
            } else if (isRemove(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Please, inform the SSN's client",
                        "Search for the Client", JOptionPane.INFORMATION_MESSAGE);
                remove(data);
            } else {
                String data = JOptionPane.showInputDialog(null,
                        "Please, inform the client data separated by ','. As the followed example: Name, SSN, Telephone, Address, Adrdress Number, City and State",
                        "Update", JOptionPane.INFORMATION_MESSAGE);
                update(data);
            }

            option = JOptionPane.showInputDialog(null,
                    "1 - Register, 2 - Search, 3 - Remove, 4 - Update and 5 - Exit",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private static void update(String data) {
        String[] separatedData = data.split(",");
        Client client = new Client(separatedData[0],separatedData[1],separatedData[2],separatedData[3],separatedData[4],separatedData[5],separatedData[6]);
        iClientDAO.update(client);
    }

    private static void remove(String data) {
        iClientDAO.delete(Long.parseLong(data));
        JOptionPane.showMessageDialog(null, "Client successfully removed: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void search(String data) {
        Client client = iClientDAO.search(Long.parseLong(data));
        if (client != null) {
            JOptionPane.showMessageDialog(null, "Client successfully found: " + client.toString(), "Success",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Client not found", "ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void register(String data) {
        String[] separatedData = data.split(",");
        Client client = new Client(separatedData[0],separatedData[1],separatedData[2],separatedData[3],separatedData[4],separatedData[5],separatedData[6]);
        Boolean isRegistered = iClientDAO.register(client);
        if (isRegistered) {
            JOptionPane.showMessageDialog(null, "Client successfully registered ", "Success",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Client already registered", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isRemove(String option) {
        if ("3".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean isSearch(String option) {
        if ("2".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean isRegister(String option) {
        if ("1".equals(option)) {
            return true;
        }
        return false;
    }

    private static void exit() {
        String registeredClients = "";
        for (Client client : iClientDAO.searchAll()) {
            registeredClients += client.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Registered Clients: " + registeredClients, "Cya",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isExitOption(String option) {
        if ("5".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean isValidOption(String option) {
        if ("1".equals(option) || "2".equals(option)
                || "3".equals(option) || "4".equals(option) || "5".equals(option)) {
            return true;
        }
        return false;
    }
}

package Modelo;

public class MenuAcceso {
    
    private int idOpcMenu, idRol;
    private boolean menuEstado;

    public MenuAcceso(int idOpcMenu, int idRol, boolean menuEstado) {
        this.idOpcMenu = idOpcMenu;
        this.idRol = idRol;
        this.menuEstado = menuEstado;
    }

    public int getIdOpcMenu() {
        return idOpcMenu;
    }

    public void setIdOpcMenu(int idOpcMenu) {
        this.idOpcMenu = idOpcMenu;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public boolean getMenuEstado() {
        return menuEstado;
    }

    public void setMenuEstado(boolean menuEstado) {
        this.menuEstado = menuEstado;
    }
}

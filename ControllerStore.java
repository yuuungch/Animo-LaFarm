import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerStore implements ActionListener, DocumentListener {
    private WindowStoreGui storeGui;
    private Store store;
    private Player player;
    // private WindowFarmGui farmGui;

    // contstructor
    public ControllerStore(WindowStoreGui storeGui, Store store, Player player) {
        this.storeGui = storeGui;
        this.store = store;
        this.player = player;
        // this.farmGui = farmGui;
        updateView();

        storeGui.setActionListener(this);
        storeGui.setDocumentsListener(this);
    }

    // update num of seeds to total num of seeds
    public void updateView() {
        storeGui.setSeedNum(store.getCurrent(), store.getNumSeeds());
        storeGui.setSeedName(store.getCurrentSeedName());
        storeGui.setSeedDesc(store.getCurrentSeedDesc());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals("BUY")) {
            // player.BuySeeds();
        } else if (e.getActionCommand().equals("<")) {
            store.prevSeed();
            updateView();
        } else if (e.getActionCommand().equals(">")) {
            store.nextSeed();
            updateView();
        }

    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub

    }

}

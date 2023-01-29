package pi.mythfighter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Button ADDMOB;

    @FXML
    private AnchorPane Admin;

    @FXML
    private Button AdminButton;

    @FXML
    private AnchorPane Combat;

    @FXML
    private Button ContinueButton;

    @FXML
    private Button DropButton;

    @FXML
    private TextField ENameFieldMob;

    @FXML
    private Label EarmorItem;

    @FXML
    private TextField EdamageFieldMob;

    @FXML
    private Label EdamageMob;

    @FXML
    private Button EditItem;

    @FXML
    private Button EditMob;

    @FXML
    private Button EditPlayer;

    @FXML
    private Button EditZone;

    @FXML
    private Label EdmaxItem;

    @FXML
    private Label EdminItem;

    @FXML
    private Label Ehp;

    @FXML
    private TextField EhpField;

    @FXML
    private TextField EhpFieldMob;

    @FXML
    private Label EhpMob;

    @FXML
    private Label Elevel;

    @FXML
    private TextField ElevelField;

    @FXML
    private TextField ElevelFieldMob;

    @FXML
    private Label ElevelMob;

    @FXML
    private Label ElevelZone;

    @FXML
    private Label Ename;

    @FXML
    private TextField EnameField;

    @FXML
    private TextField EnameFieldItem;

    @FXML
    private Label EnameItem;

    @FXML
    private Label EnameMob;

    @FXML
    private Label EnameZone;

    @FXML
    private TextField EquantFieldItem;

    @FXML
    private Label EquantItem;

    @FXML
    private Button EquipButton;

    @FXML
    private TextField ErarityFieldItem;

    @FXML
    private Label ErarityItem;

    @FXML
    private Label Estr;

    @FXML
    private TextField EstrField;

    @FXML
    private TextField EtypeFieldItem;

    @FXML
    private Label EtypeItem;

    @FXML
    private AnchorPane Explore;

    @FXML
    private Button ExploreButton;

    @FXML
    private Button FightButton;

    @FXML
    private Button ForestButton;

    @FXML
    private AnchorPane Head;

    @FXML
    private AnchorPane Home;

    @FXML
    private Button HomeButton;

    @FXML
    private AnchorPane Inventory;

    @FXML
    private Button InventoryButton;

    @FXML
    private ListView<?> InventoryList;

    @FXML
    private AnchorPane ItemEdit;

    @FXML
    private Button LootButton;

    @FXML
    private AnchorPane MobEdit;

    @FXML
    private Label MobHP;

    @FXML
    private TextField Mob_Level;

    @FXML
    private ImageView Mob_image;

    @FXML
    private ImageView Mob_image2;

    @FXML
    private TextField Mob_name;

    @FXML
    private AnchorPane PlayerEdit;

    @FXML
    private Label PlayerHP;

    @FXML
    private ImageView Player_Image;

    @FXML
    private Button QuitButton;

    @FXML
    private Button REMOVEMOB;

    @FXML
    private Button Run1Button;

    @FXML
    private Button Run2Button;

    @FXML
    private Button SaveStatsZone;

    @FXML
    private Button StatsSave;

    @FXML
    private Button StatsSaveItem;

    @FXML
    private Button StatsSaveMob;

    @FXML
    private ImageView Title;

    @FXML
    private TextArea Turns;

    @FXML
    private AnchorPane Zone;

    @FXML
    private AnchorPane ZoneEdit;


    public Mob mobc=new Mob();
    public Player P1=new Player("Player");
    public Item Goblin_Ear=new Item("Goblin Ear",5,"common","material");
    public Item Orc_Ear=new Item("Goblin Ear",5,"common","material");
    public Equipment Silver_Sword=new Equipment("Silver Sword",1,"common","weapon",0,2,5);
    public List<Item> Goblin_Drop=getDatago();
    public List<Item> Orc_Drop=getDataor();

    public List<Mob>Forest_Mobs=getDatagf();
    public List<Item> getDatago()
    {
        List<Item> items = new ArrayList<>();
        items.add( Goblin_Ear );
        items.add( Silver_Sword );
        return items;
    }
    public Mob generateEnemy(Zone z)
    {
        return z.findEnemy();
    }
    public List<Item> getDataor()
    {
        List<Item> items = new ArrayList<>();
        items.add( Orc_Ear );
        items.add( Silver_Sword );
        return items;
    }
    public Mob Goblin=new Mob("Goblin",10,20,Goblin_Drop,"Forest",15,1);
    public Mob Orc=new Mob("Orc",15,30,Orc_Drop,"Forest",25,2);
    public List<Mob> getDatagf()
    {
        List<Mob> Mobs = new ArrayList<>();
        Mobs.add(Goblin);
        Mobs.add(Orc);
        return Mobs;
    }
    public Zone Green_Forest=new Zone("Forest",Forest_Mobs,1);
@FXML
    public void goToPage(ActionEvent event) throws IOException {
        if(event.getSource() == HomeButton) {
            Home.setVisible(true);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Admin.setVisible(false);
            Combat.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);
        } else if(event.getSource() == InventoryButton) {
            Home.setVisible(false);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Combat.setVisible(false);
            Admin.setVisible(false);
            Inventory.setVisible(true);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);

        }   else if(event.getSource() == EditPlayer) {
                Home.setVisible(false);
                Zone.setVisible(false);
                Explore.setVisible(false);
                Combat.setVisible(false);
                Admin.setVisible(false);
                Inventory.setVisible(false);
                PlayerEdit.setVisible(true);
                ZoneEdit.setVisible(false);
                MobEdit.setVisible(false);
                ItemEdit.setVisible(false);
        }   else if(event.getSource() == EditZone) {
            Home.setVisible(false);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Combat.setVisible(false);
            Admin.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(true);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);
        }   else if(event.getSource() == EditMob) {
            Home.setVisible(false);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Combat.setVisible(false);
            Admin.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(true);
            ItemEdit.setVisible(false);
        }   else if(event.getSource() == EditItem) {
            Home.setVisible(false);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Combat.setVisible(false);
            Admin.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(true);

        } else if(event.getSource() == QuitButton) {
            Stage stage = (Stage) QuitButton.getScene().getWindow();
            stage.close();

        } else if(event.getSource() == ExploreButton) {
            Home.setVisible(false);
            Zone.setVisible(true);
            Explore.setVisible(false);
            Combat.setVisible(false);
            Inventory.setVisible(false);
            Admin.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);
        } else if(event.getSource() == AdminButton) {
            Home.setVisible(false);
            Zone.setVisible(false);
            Admin.setVisible(true);
            Explore.setVisible(false);
            Combat.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);

        } else if(event.getSource() == ForestButton) {
            P1.setZone("Forest");
            mobc=new Mob();
            mobc=generateEnemy(Green_Forest);
            Mob_name.setText(mobc.getName());
            Mob_Level.setText(Integer.toString(mobc.getLevel()));
            Home.setVisible(false);
            Zone.setVisible(false);
            Explore.setVisible(true);
            Admin.setVisible(false);
            Combat.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);

        } else if(event.getSource() == FightButton) {
            Home.setVisible(false);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Admin.setVisible(false);
            Combat.setVisible(true);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);
            int pchp=P1.getHealth(),mchp=mobc.getHealth();
            while(pchp>0 && mchp>0) {
                int pdamage=P1.dealDamage();
                Turns.appendText("Player dealt" + Integer.toString(pdamage) + "\n");
                Turns.appendText("You took" + Integer.toString(mobc.getDamage()-P1.getE().getTotalarmor()) + "\n");
                mchp = mchp - pdamage;
                pchp = pchp - mobc.getDamage();
                MobHP.setText(Integer.toString(mchp) + "/" + Integer.toString(mobc.getHealth()));
                PlayerHP.setText(Integer.toString(pchp) + "/" + Integer.toString(P1.getHealth()));
            }
            if(mchp<=0 && pchp >0)
            {
                P1.addexp(mobc.getExp());
            }
        } else if(event.getSource() == Run1Button) {
            Home.setVisible(true);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Admin.setVisible(false);
            Combat.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);

        }
        else if(event.getSource() == Run2Button) {
            Home.setVisible(true);
            Zone.setVisible(false);
            Explore.setVisible(false);
            Admin.setVisible(false);
            Combat.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);

        }
        else if(event.getSource() == LootButton) {


        }
        else if(event.getSource() == ContinueButton) {
            Home.setVisible(false);
            Zone.setVisible(false);
            Explore.setVisible(true);
            Admin.setVisible(false);
            Combat.setVisible(false);
            Inventory.setVisible(false);
            PlayerEdit.setVisible(false);
            ZoneEdit.setVisible(false);
            MobEdit.setVisible(false);
            ItemEdit.setVisible(false);

        }
    }

}
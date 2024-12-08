import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class InventoryController {
    private String judulAlbumAlbum;
    private String namaArtisAlbum;
    private int jumlahTotalAlbum;
    private int tersediaAlbum;
    private int sewaAlbum;

    @FXML
    private TableView<Album> albumTable;

    @FXML
    private Button hapusButton;

    @FXML
    private TableColumn<Album, String> judulAlbumColumn;

    @FXML
    private TextField judulAlbumField;

    @FXML
    private TextField jumlahRentedField;

    @FXML
    private TableColumn<Album, Integer> jumlahTotalColumn;

    @FXML
    private TextField jumlahTotalField;

    @FXML
    private TableColumn<Album, String> namaArtisColumn;

    @FXML
    private TextField namaArtisField;

    @FXML
    private Button rentSelectedButton;

    @FXML
    private Button tambahButton;

    @FXML
    private TableColumn<Album, Integer> tersediaColumn;

    @FXML
    private Button updateButton;

    @FXML
    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        judulAlbumColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("JudulAlbum"));
        namaArtisColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("NamaArtis"));
        tersediaColumn.setCellValueFactory(new PropertyValueFactory<Album, Integer>("Tersedia"));
        jumlahTotalColumn.setCellValueFactory(new PropertyValueFactory<Album, Integer>("JumlahTotal"));

        albumTable.setItems(albumList);
    }

    @FXML
    private void clearData(){
        namaArtisField.clear();
        judulAlbumField.clear();
        jumlahTotalField.clear();
        jumlahRentedField.clear();
    }

    @FXML
    void addAlbum(ActionEvent event) {
        try {
            judulAlbumAlbum = judulAlbumField.getText();
            namaArtisAlbum = namaArtisField.getText();
            jumlahTotalAlbum = Integer.parseInt(jumlahTotalField.getText());
            sewaAlbum = Integer.parseInt(jumlahRentedField.getText());
            tersediaAlbum = jumlahTotalAlbum - sewaAlbum;
    
            if (tersediaAlbum < 0) {
                Alert availAlert = new Alert(AlertType.ERROR);
                availAlert.setTitle("ERROR");
                availAlert.setContentText("Album tersedia tidak boleh kurang dari 0");
                availAlert.showAndWait();
                return;
            }
    
            Album newAlbum = new Album(judulAlbumAlbum, namaArtisAlbum, jumlahTotalAlbum, tersediaAlbum, sewaAlbum);
            albumTable.getItems().add(newAlbum);
            clearData();
    
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Album  berhasil ditambahkan");
            alert.setHeaderText("Message");
            alert.setContentText("Album " + judulAlbumAlbum + " berhasil ditambahkan!");
            alert.showAndWait();
    
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR); 
            alert.setTitle("Input salah");
            alert.setContentText("Tolong periksa kembali data yang dimasukkan");
            alert.showAndWait();
        }    
    }


    @FXML
    void deleteData(ActionEvent event) {
        try {
            for (Album i : albumList) {
                if (i.getJudulAlbum().equals(judulAlbumAlbum)) {
                    albumList.remove(i);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Album berhasil dihapus");
                    alert.setHeaderText("Message");
                    alert.setContentText("Album " + judulAlbumAlbum + " berhasil dihapus!");
                    alert.showAndWait();
                    break;
                }                                                                                                               
            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Failed to delete data");
            alert.showAndWait();
        }
    }

    @FXML
    void rentAlbum(ActionEvent event) {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
    
            if (selectedAlbum != null) {
                if (selectedAlbum.getTersedia() > 0) {
                    selectedAlbum.settersedia(selectedAlbum.getTersedia() - 1);
                    selectedAlbum.setsewa(selectedAlbum.getSewa() + 1);
                    
                    albumTable.refresh();
                    clearData();
    
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setContentText("Album " + judulAlbumAlbum + " berhasil disewa!");
                    alert.showAndWait();
                } else {
                    // Show error if no copies are tersedia
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setContentText("Tidak ada album yang tersedia untuk disewa");
                    alert.showAndWait();
                }
            } else {
                // Show alert if no album is selected
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setContentText("Tidak ada album yang dipilih untuk disewa");
                alert.showAndWait();
            }
        
    }

    @FXML
    void showData(MouseEvent event) {
        try {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();

            if (selectedAlbum != null) {
                judulAlbumField.setText(selectedAlbum.getJudulAlbum());
                namaArtisField.setText(selectedAlbum.getNamaArtis());
                jumlahTotalField.setText(String.valueOf(selectedAlbum.getJumlahTotal()));
                jumlahRentedField.setText(String.valueOf(selectedAlbum.getSewa()));
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setContentText("Tidak ada album yang dipilih");
                alert.showAndWait();
            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Kesalahan terjadi saat menampilkan album data");
            alert.showAndWait();
        }
    }

    @FXML
    void updateData(ActionEvent event) {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                judulAlbumAlbum = judulAlbumField.getText();
                namaArtisAlbum = namaArtisField.getText();
                jumlahTotalAlbum = Integer.parseInt(jumlahTotalField.getText());
                sewaAlbum = Integer.parseInt(jumlahRentedField.getText());
                tersediaAlbum = jumlahTotalAlbum - sewaAlbum;

                if (tersediaAlbum < 0) {
                    Alert availAlert = new Alert(AlertType.ERROR);
                    availAlert.setTitle("ERROR");
                    availAlert.setContentText("Album yang tersedia tidak boleh kurang dari 0");
                    availAlert.showAndWait();
                    return;
                }

                selectedAlbum.setjudulAlbum(judulAlbumAlbum);
                selectedAlbum.setnamaArtis(namaArtisAlbum);
                selectedAlbum.setjumlahTotal(jumlahTotalAlbum);
                selectedAlbum.settersedia(tersediaAlbum);
                selectedAlbum.setsewa(sewaAlbum);

                albumTable.refresh(); 
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("SUCCESS");
                alert.setContentText("Album berhasil diupdate!");
                alert.showAndWait();

            } catch (NumberFormatException e) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setContentText("Masukkan input yang sesuai");
                alert.showAndWait();
            }
        } else {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setContentText("Tidak ada album yang dipilih untuk diupdate");
        alert.showAndWait();
        }
    }
}


   
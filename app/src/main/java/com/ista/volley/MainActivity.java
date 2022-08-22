package com.ista.volley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.ista.volley.models.Fruit;
import com.ista.volley.models.Nutrition;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv_fruits;
    RequestQueue request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_fruits = findViewById(R.id.lv_Fruits);
        request = Volley.newRequestQueue(this);
        ListAll();
    }

    public void ListAll() {
        JsonArrayRequest jsRequest = new JsonArrayRequest(
                    "https://www.fruityvice.com/api/fruit/all",
                array -> jsonToArray(array),
                error -> Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show()
        );
        Volley.newRequestQueue(this).add(jsRequest);
    }

    private void fillListView(List<Fruit> fruits) {
        ArrayAdapter<Fruit> everyone = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, fruits);
        lv_fruits.setAdapter(everyone);
    }

    private void jsonToArray(JSONArray jsarray){
        ArrayList<Fruit> fruits = new ArrayList<>();
        for(int i = 0; i < jsarray.length(); i++){
            JSONObject json;
            Fruit fruit = new Fruit();
            try {
                json = jsarray.getJSONObject(i);
                fruit.setGenus(json.getString("genus"));
                fruit.setName(json.getString("name"));
                fruit.setId(json.getInt("id"));
                fruit.setFamily(json.getString("family"));
                fruit.setOrder(json.getString("order"));
                //Nutrition nutrition = (Nutrition) json.get("nutritions");
                //fruit.setNutrition(nutrition);
                fruits.add(fruit);
                fillListView(fruits);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }



}
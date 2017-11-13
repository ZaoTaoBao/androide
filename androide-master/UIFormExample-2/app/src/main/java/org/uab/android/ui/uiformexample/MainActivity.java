package org.uab.android.ui.uiformexample;

import java.util.Calendar;
import java.util.List;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import com.orm.SugarContext;
import com.orm.SugarRecord;

public class MainActivity extends Activity {
	AutoCompleteTextView	classesAutoCompleteTextView;
	TextView				defaultHourTextView;
	EditText creditosText;

	//mirar como aplicar anotaciones para la inyección de dependencias
	private ModelRepository modelItemsRepositoryImpl;

	private RecyclerView recyclerView;
	private ModelItemsAdapter recyclerViewAdapter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//no tiene que ser necesario.
		//SugarContext.init(this);
		//EditText credit  = (EditText) findViewById(R.id.creditsEditTextMain);




		Button goTo = (Button) findViewById(R.id.goToList);
		goTo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//ocultamos toda la mandanga de insert

				findViewById(R.id.sep1Main).setVisibility(View.INVISIBLE);
				findViewById(R.id.classLabelMain).setVisibility(View.INVISIBLE);
				findViewById(R.id.classAutoCompleteMain).setVisibility(View.INVISIBLE);
				findViewById(R.id.creditLabelMain).setVisibility(View.INVISIBLE);
				findViewById(R.id.creditsEditTextMain).setVisibility(View.INVISIBLE);
				findViewById(R.id.sep2Main).setVisibility(View.INVISIBLE);
				findViewById(R.id.hourLabelMain).setVisibility(View.INVISIBLE);
				findViewById(R.id.defaultHourLabelMain).setVisibility(View.INVISIBLE);

				//creamos un primer modelo para tener algo que mostrar.
				Model model = new Model();
				model.createFirstModel();
				//vamos a recuperar la recyclerView
				recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
				GridLayoutManager mGrid = new GridLayoutManager(getApplicationContext(), 1);//si añadimos más partimos view by cols
				recyclerView.setLayoutManager(mGrid);
				recyclerView.setHasFixedSize(true);
				ModelRepository modelRepository = new ModelRepositoryImpl();
				//Recuperamos lista de modelos existentes.
				List<Model> listaModelos = modelRepository.findAll();
				//le damos al adapatador
				ModelItemsAdapter mAdapter = new ModelItemsAdapter(getApplicationContext(), listaModelos);
				//lo metemos en la recyclerView.
				recyclerView.setAdapter(mAdapter);
			}
		});

		//nos permite salvar
		Button save = (Button) findViewById(R.id.save);
		save.setOnClickListener(new OnClickListener() {
			EditText credit  = (EditText) findViewById(R.id.creditsEditTextMain);
			AutoCompleteTextView nombreAss = (AutoCompleteTextView) findViewById(R.id.classAutoCompleteMain);
			@Override
			public void onClick(View v) {

				Model model = new Model();
				model.setCreditos(String.valueOf(credit.getText()));
				model.setHora("12/12/2012");
				model.setNombreAsig(String.valueOf(nombreAss.getText()));
				ModelRepository modelRepository = new ModelRepositoryImpl();
				modelRepository.save(model);


			}


		});


	}
}
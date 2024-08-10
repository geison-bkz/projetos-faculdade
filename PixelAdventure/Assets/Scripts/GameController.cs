using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class GameController : MonoBehaviour
{

    public int pontuacao = 0;
    public int contador = 0;

    public static GameController controller;

    public Text txtPonto;

    private void Start()
    {
        controller = this;
    }

    public void atualizaPonto()
    {
        txtPonto.text = pontuacao.ToString();
    }

}

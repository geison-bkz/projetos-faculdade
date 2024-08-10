using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CollectItem : MonoBehaviour
{
    private SpriteRenderer sr;
    private CircleCollider2D circle;

    public int pointValue;
    public GameObject collected;

    private void Start()
    {
        sr = GetComponent<SpriteRenderer>();
        circle = GetComponent<CircleCollider2D>();
    }

    private void Update()
    {
        
    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if(collision.gameObject.tag == "Player")
        {
            sr.enabled = false;
            circle.enabled = false;
            collected.SetActive(true);
            Destroy(gameObject, 0.5f);
            GameController.controller.pontuacao += pointValue;
            GameController.controller.atualizaPonto();
            GameController.controller.contador++;
        }
    }
}

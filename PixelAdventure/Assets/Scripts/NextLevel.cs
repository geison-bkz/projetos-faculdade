using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class NextLevel : MonoBehaviour
{
    public int itensToNextLevel;
    public string lvlName;

    private BoxCollider2D bc;
    private SpriteRenderer sr;
    public Animator anim;
    

    private void Start()
    {
        bc = GetComponent<BoxCollider2D>();
        sr = GetComponent<SpriteRenderer>();
    }

    private void Update()
    {
        if(GameController.controller.contador >= itensToNextLevel)
        {
            Debug.Log("Ativou o checkpoint");
            bc.enabled = true;
            sr.enabled = true;
            anim.SetBool("checked", true);
        }
    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.gameObject.tag == "Player")
        {   
            SceneManager.LoadScene(lvlName);
        }
    }
}

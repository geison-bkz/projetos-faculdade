using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FallingPlatform : MonoBehaviour
{
    public float fallingTime;

    private TargetJoint2D tj;
    private BoxCollider2D bc;

    private void Start()
    {
        tj = GetComponent<TargetJoint2D>();
        bc = GetComponent<BoxCollider2D>();
    }

    private void OnCollisionEnter2D(Collision2D collision)
    {
        if(collision.gameObject.tag == "Player")
        {
            Invoke("Falling", fallingTime);
        }
    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.gameObject.layer == 10)
        {
            Destroy(gameObject);
        }
    }

    void Falling()
    {
        tj.enabled = false;
        bc.isTrigger = true;
    }

}

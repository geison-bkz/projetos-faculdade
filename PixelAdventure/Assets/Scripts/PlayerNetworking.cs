using Photon.Pun;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerNetworking : MonoBehaviour
{
    public MonoBehaviour[] scriptsToIgnore;

    private PhotonView pv;
    // Start is called before the first frame update
    void Start()
    {
        pv = GetComponent<PhotonView>();
        if (!pv.IsMine)
        {
            foreach(var script in scriptsToIgnore)
            {
                script.enabled = false;
            }
        }
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}

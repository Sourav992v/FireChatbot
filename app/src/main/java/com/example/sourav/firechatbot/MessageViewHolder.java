package com.example.sourav.firechatbot;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Sourav on 10/28/2017.
 */

class MessageViewHolder extends RecyclerView.ViewHolder {

    TextView messageTextView;
    ImageView messageImageView;
    TextView messengerTextView;
    TextView phoneTextView;
    CardView cardView;
    CircleImageView messengerImageView;

    MessageViewHolder(View itemView) {
        super(itemView);
        messageTextView = itemView.findViewById(R.id.message_text_view);
        messageImageView = itemView.findViewById(R.id.message_image);
        messengerTextView = itemView.findViewById(R.id.user_name_text);
        phoneTextView = itemView.findViewById(R.id.user_phone_text);
        messengerImageView = itemView.findViewById(R.id.messenger_image);
        cardView = itemView.findViewById(R.id.item_card_view);
    }

}
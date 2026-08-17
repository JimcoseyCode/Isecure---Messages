.class public final Lexpo/modules/contacts/next/intents/ContactIntentDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001e\u0010\u0010\u001a\u00020\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0008H\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00148\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00148\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00148\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;",
        "",
        "<init>",
        "()V",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
        "Li7/B;",
        "registerContactContracts",
        "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "lookupKeyUri",
        "",
        "launchEditContact",
        "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;",
        "",
        "Landroid/content/ContentValues;",
        "contentValues",
        "launchAddContact",
        "(Ljava/util/List;Ln7/f;)Ljava/lang/Object;",
        "launchPickContact",
        "(Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;",
        "Lexpo/modules/contacts/next/intents/EditContactInput;",
        "editContactLauncher",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;",
        "Lexpo/modules/contacts/next/intents/AddContactInput;",
        "addContactLauncher",
        "Lexpo/modules/contacts/next/intents/PickContactInput;",
        "pickContactLauncher",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private addContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher<",
            "Lexpo/modules/contacts/next/intents/AddContactInput;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private editContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher<",
            "Lexpo/modules/contacts/next/intents/EditContactInput;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private pickContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher<",
            "Lexpo/modules/contacts/next/intents/PickContactInput;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final launchAddContact(Ljava/util/List;Ln7/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/ContentValues;",
            ">;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->addContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "addContactLauncher"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    new-instance v1, Lexpo/modules/contacts/next/intents/AddContactInput;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Lexpo/modules/contacts/next/intents/AddContactInput;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p2}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;->launch(Ljava/io/Serializable;Ln7/f;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final launchEditContact(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->editContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "editContactLauncher"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    new-instance v1, Lexpo/modules/contacts/next/intents/EditContactInput;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Lexpo/modules/contacts/next/intents/EditContactInput;-><init>(Landroid/net/Uri;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p2}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;->launch(Ljava/io/Serializable;Ln7/f;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final launchPickContact(Ln7/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->pickContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "pickContactLauncher"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    new-instance v1, Lexpo/modules/contacts/next/intents/PickContactInput;

    .line 12
    .line 13
    invoke-direct {v1}, Lexpo/modules/contacts/next/intents/PickContactInput;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;->launch(Ljava/io/Serializable;Ln7/f;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final registerContactContracts(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Ln7/f;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;-><init>(Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Ln7/f;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->label:I

    .line 34
    .line 35
    const/4 v7, 0x3

    .line 36
    const/4 v8, 0x2

    .line 37
    const/4 v2, 0x1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-eq v1, v2, :cond_3

    .line 41
    .line 42
    if-eq v1, v8, :cond_2

    .line 43
    .line 44
    if-ne v1, v7, :cond_1

    .line 45
    .line 46
    iget-object p1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 49
    .line 50
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 66
    .line 67
    iget-object v1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 70
    .line 71
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    iget-object p1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 78
    .line 79
    iget-object v1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;

    .line 82
    .line 83
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move p2, v2

    .line 91
    new-instance v2, Lexpo/modules/contacts/next/intents/EditContactContract;

    .line 92
    .line 93
    invoke-direct {v2}, Lexpo/modules/contacts/next/intents/EditContactContract;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p0, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$1:Ljava/lang/Object;

    .line 99
    .line 100
    iput p2, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->label:I

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    const/4 v5, 0x2

    .line 104
    const/4 v6, 0x0

    .line 105
    move-object v1, p1

    .line 106
    invoke-static/range {v1 .. v6}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    if-ne p2, v0, :cond_5

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    move-object p1, p0

    .line 114
    :goto_2
    check-cast p2, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 115
    .line 116
    iput-object p2, p1, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->editContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 117
    .line 118
    new-instance v2, Lexpo/modules/contacts/next/intents/AddContactContract;

    .line 119
    .line 120
    invoke-direct {v2}, Lexpo/modules/contacts/next/intents/AddContactContract;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object p0, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    iput v8, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->label:I

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    const/4 v5, 0x2

    .line 131
    const/4 v6, 0x0

    .line 132
    invoke-static/range {v1 .. v6}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-ne p2, v0, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    move-object p1, p0

    .line 140
    :goto_3
    check-cast p2, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 141
    .line 142
    iput-object p2, p1, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->addContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 143
    .line 144
    new-instance v2, Lexpo/modules/contacts/next/intents/PickContactContract;

    .line 145
    .line 146
    invoke-direct {v2}, Lexpo/modules/contacts/next/intents/PickContactContract;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-object p0, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$0:Ljava/lang/Object;

    .line 150
    .line 151
    const/4 p1, 0x0

    .line 152
    iput-object p1, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->L$1:Ljava/lang/Object;

    .line 153
    .line 154
    iput v7, v4, Lexpo/modules/contacts/next/intents/ContactIntentDelegate$registerContactContracts$1;->label:I

    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    const/4 v5, 0x2

    .line 158
    const/4 v6, 0x0

    .line 159
    invoke-static/range {v1 .. v6}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller$DefaultImpls;->registerForActivityResult$default(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-ne p2, v0, :cond_7

    .line 164
    .line 165
    :goto_4
    return-object v0

    .line 166
    :cond_7
    move-object p1, p0

    .line 167
    :goto_5
    check-cast p2, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 168
    .line 169
    iput-object p2, p1, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->pickContactLauncher:Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;

    .line 170
    .line 171
    sget-object p1, Li7/B;->a:Li7/B;

    .line 172
    .line 173
    return-object p1
.end method

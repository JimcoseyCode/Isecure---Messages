.class final Lexpo/modules/contacts/next/Contact$editWithForm$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/Contact;->editWithForm(Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "",
        "<anonymous>",
        "(LR8/N;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.Contact$editWithForm$2"
    f = "Contact.kt"
    l = {
        0x89,
        0x89
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/next/Contact;


# direct methods
.method constructor <init>(Lexpo/modules/contacts/next/Contact;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/Contact;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->this$0:Lexpo/modules/contacts/next/Contact;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/contacts/next/Contact$editWithForm$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->this$0:Lexpo/modules/contacts/next/Contact;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lexpo/modules/contacts/next/Contact$editWithForm$2;-><init>(Lexpo/modules/contacts/next/Contact;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/Contact$editWithForm$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/Contact$editWithForm$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/Contact$editWithForm$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/Contact$editWithForm$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-object v1, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 30
    .line 31
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->this$0:Lexpo/modules/contacts/next/Contact;

    .line 39
    .line 40
    invoke-virtual {p1}, Lexpo/modules/contacts/next/Contact;->getIntentDelegate()Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object p1, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->this$0:Lexpo/modules/contacts/next/Contact;

    .line 45
    .line 46
    iput-object v1, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    iput v3, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->label:I

    .line 49
    .line 50
    invoke-static {p1, p0}, Lexpo/modules/contacts/next/Contact;->access$getLookupKeyUri(Lexpo/modules/contacts/next/Contact;Ln7/f;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    check-cast p1, Landroid/net/Uri;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    iput-object v3, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput v2, p0, Lexpo/modules/contacts/next/Contact$editWithForm$2;->label:I

    .line 63
    .line 64
    invoke-virtual {v1, p1, p0}, Lexpo/modules/contacts/next/intents/ContactIntentDelegate;->launchEditContact(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_4

    .line 69
    .line 70
    :goto_1
    return-object v0

    .line 71
    :cond_4
    return-object p1
.end method

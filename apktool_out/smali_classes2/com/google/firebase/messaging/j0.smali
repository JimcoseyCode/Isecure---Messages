.class public final synthetic Lcom/google/firebase/messaging/j0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP4/f;


# instance fields
.field public final synthetic a:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/messaging/j0;->a:Landroid/content/Intent;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onComplete(LP4/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/j0;->a:Landroid/content/Intent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/firebase/messaging/k0;->a(Landroid/content/Intent;LP4/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

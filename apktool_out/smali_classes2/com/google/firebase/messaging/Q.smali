.class public final synthetic Lcom/google/firebase/messaging/Q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Z

.field public final synthetic i:LP4/m;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLP4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/messaging/Q;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/firebase/messaging/Q;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/firebase/messaging/Q;->i:LP4/m;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/Q;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/google/firebase/messaging/Q;->h:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/firebase/messaging/Q;->i:LP4/m;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/S;->a(Landroid/content/Context;ZLP4/m;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

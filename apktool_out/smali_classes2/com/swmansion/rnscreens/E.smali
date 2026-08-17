.class public final synthetic Lcom/swmansion/rnscreens/E;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Lcom/swmansion/rnscreens/F;


# direct methods
.method public synthetic constructor <init>(ZLcom/swmansion/rnscreens/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/E;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lcom/swmansion/rnscreens/E;->h:Lcom/swmansion/rnscreens/F;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/E;->g:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/rnscreens/E;->h:Lcom/swmansion/rnscreens/F;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/F;->w(ZLcom/swmansion/rnscreens/F;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

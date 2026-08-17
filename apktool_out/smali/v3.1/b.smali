.class public final synthetic Lv3/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/facebook/react/modules/devloading/DevLoadingModule;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/Double;

.field public final synthetic j:Ljava/lang/Double;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/devloading/DevLoadingModule;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv3/b;->g:Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 5
    .line 6
    iput-object p2, p0, Lv3/b;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lv3/b;->i:Ljava/lang/Double;

    .line 9
    .line 10
    iput-object p4, p0, Lv3/b;->j:Ljava/lang/Double;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv3/b;->g:Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 2
    .line 3
    iget-object v1, p0, Lv3/b;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lv3/b;->i:Ljava/lang/Double;

    .line 6
    .line 7
    iget-object v3, p0, Lv3/b;->j:Ljava/lang/Double;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/facebook/react/modules/devloading/DevLoadingModule;->b(Lcom/facebook/react/modules/devloading/DevLoadingModule;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

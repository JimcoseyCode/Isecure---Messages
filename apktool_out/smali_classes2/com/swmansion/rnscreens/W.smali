.class public final synthetic Lcom/swmansion/rnscreens/W;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic g:LL6/b;

.field public final synthetic h:Lcom/swmansion/rnscreens/X;


# direct methods
.method public synthetic constructor <init>(LL6/b;Lcom/swmansion/rnscreens/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/rnscreens/W;->g:LL6/b;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/swmansion/rnscreens/W;->h:Lcom/swmansion/rnscreens/X;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/W;->g:LL6/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/rnscreens/W;->h:Lcom/swmansion/rnscreens/X;

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    move v3, p2

    .line 7
    move v4, p3

    .line 8
    move v5, p4

    .line 9
    move/from16 v6, p5

    .line 10
    .line 11
    move/from16 v7, p6

    .line 12
    .line 13
    move/from16 v8, p7

    .line 14
    .line 15
    move/from16 v9, p8

    .line 16
    .line 17
    move/from16 v10, p9

    .line 18
    .line 19
    invoke-static/range {v0 .. v10}, Lcom/swmansion/rnscreens/X;->N(LL6/b;Lcom/swmansion/rnscreens/X;Landroid/view/View;IIIIIIII)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

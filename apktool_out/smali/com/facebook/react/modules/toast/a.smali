.class public final synthetic Lcom/facebook/react/modules/toast/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/facebook/react/modules/toast/ToastModule;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/toast/a;->g:Lcom/facebook/react/modules/toast/ToastModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/modules/toast/a;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lcom/facebook/react/modules/toast/a;->i:I

    .line 9
    .line 10
    iput p4, p0, Lcom/facebook/react/modules/toast/a;->j:I

    .line 11
    .line 12
    iput p5, p0, Lcom/facebook/react/modules/toast/a;->k:I

    .line 13
    .line 14
    iput p6, p0, Lcom/facebook/react/modules/toast/a;->l:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/toast/a;->g:Lcom/facebook/react/modules/toast/ToastModule;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/modules/toast/a;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/modules/toast/a;->i:I

    .line 6
    .line 7
    iget v3, p0, Lcom/facebook/react/modules/toast/a;->j:I

    .line 8
    .line 9
    iget v4, p0, Lcom/facebook/react/modules/toast/a;->k:I

    .line 10
    .line 11
    iget v5, p0, Lcom/facebook/react/modules/toast/a;->l:I

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lcom/facebook/react/modules/toast/ToastModule;->c(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

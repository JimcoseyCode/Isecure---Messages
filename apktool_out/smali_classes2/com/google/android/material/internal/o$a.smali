.class Lcom/google/android/material/internal/o$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/core/view/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/o;->b(Landroid/view/View;Lcom/google/android/material/internal/o$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Lcom/google/android/material/internal/o$c;

.field final synthetic h:Lcom/google/android/material/internal/o$d;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/o$c;Lcom/google/android/material/internal/o$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/internal/o$a;->g:Lcom/google/android/material/internal/o$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/internal/o$a;->h:Lcom/google/android/material/internal/o$d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/internal/o$a;->g:Lcom/google/android/material/internal/o$c;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/material/internal/o$d;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/material/internal/o$a;->h:Lcom/google/android/material/internal/o$d;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/google/android/material/internal/o$d;-><init>(Lcom/google/android/material/internal/o$d;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/material/internal/o$c;->a(Landroid/view/View;Landroidx/core/view/L0;Lcom/google/android/material/internal/o$d;)Landroidx/core/view/L0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.class public final LI2/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LT2/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI2/b;-><init>(LD2/b;LR2/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI2/b;


# direct methods
.method constructor <init>(LI2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI2/b$b;->a:LI2/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ILandroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    const-string p1, "bitmap"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(I)Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LI2/b$b;->a:LI2/b;

    .line 2
    .line 3
    invoke-static {v0}, LI2/b;->b(LI2/b;)LD2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, LD2/b;->d(I)Lg2/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

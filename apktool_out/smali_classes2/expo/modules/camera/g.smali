.class public final synthetic Lexpo/modules/camera/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic g:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/camera/g;->g:Lexpo/modules/camera/ExpoCameraView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/g;->g:Lexpo/modules/camera/ExpoCameraView;

    .line 2
    .line 3
    check-cast p1, Lexpo/modules/camera/utils/BarCodeScannerResult;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lexpo/modules/camera/ExpoCameraView;->b(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Li7/B;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
